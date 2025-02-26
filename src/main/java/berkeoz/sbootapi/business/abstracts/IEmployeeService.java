package berkeoz.sbootapi.business.abstracts;

import java.util.List;

import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.entities.concretes.Employee;

public interface IEmployeeService{
	DataResult<List<Employee>> getAll();
}
