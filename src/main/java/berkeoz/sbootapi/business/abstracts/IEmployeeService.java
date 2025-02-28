package berkeoz.sbootapi.business.abstracts;

import java.util.List;

import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.entities.concretes.Employee;
import jakarta.annotation.Nullable;

public interface IEmployeeService{
	DataResult<List<Employee>> getAll();
	DataResult<Employee> getByFirstNameAndLastName(String firstName, @Nullable String lastName);
	DataResult<List<Employee>> getByTitle(String title);
	DataResult<List<Employee>> getByTitleOfCourtesy(String titleOfCourtesy);
	DataResult<List<Employee>> getByCountry(String country);
	DataResult<List<Employee>> getByRegion(String region);
}
