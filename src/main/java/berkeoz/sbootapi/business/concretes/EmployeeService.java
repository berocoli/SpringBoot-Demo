package berkeoz.sbootapi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import berkeoz.sbootapi.business.abstracts.IEmployeeService;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.SuccessDataResult;
import berkeoz.sbootapi.dataAccess.abstracts.EmployeeDao;
import berkeoz.sbootapi.entities.concretes.Employee;
import jakarta.annotation.Nullable;

@Service
public class EmployeeService implements IEmployeeService {

	private EmployeeDao employeeDao;

	@Autowired
	public EmployeeService(EmployeeDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

	@Override
	public DataResult<List<Employee>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Employee>>(this.employeeDao.findAll(), "Data Listed");
	}

	@Override
	public DataResult<Employee> getByFirstNameAndLastName(String firstName, @Nullable String lastName) {
		return new SuccessDataResult<Employee>(this.employeeDao.getByFirstNameAndLastName(firstName, lastName));
	}

	@Override
	public DataResult<List<Employee>> getByTitle(String title) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByTitle(title));
	}

	@Override
	public DataResult<List<Employee>> getByTitleOfCourtesy(String titleOfCourtesy) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByTitleOfCourtesy(titleOfCourtesy));
	}

	@Override
	public DataResult<List<Employee>> getByCountry(String country) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByCountry(country));
	}

	@Override
	public DataResult<List<Employee>> getByRegion(String region) {
		return new SuccessDataResult<List<Employee>>(this.employeeDao.getByRegion(region));
	}

}
