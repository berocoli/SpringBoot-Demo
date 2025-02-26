package berkeoz.sbootapi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import berkeoz.sbootapi.business.abstracts.IEmployeeService;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.SuccessDataResult;
import berkeoz.sbootapi.dataAccess.abstracts.EmployeeDao;
import berkeoz.sbootapi.entities.concretes.Employee;

@Service
public class EmployeeService implements IEmployeeService{

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

}
