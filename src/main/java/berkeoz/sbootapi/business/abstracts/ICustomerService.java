package berkeoz.sbootapi.business.abstracts;

import java.util.List;

import berkeoz.sbootapi.business.dtos.customerDtos.CreateCustomerDto;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.Result;
import berkeoz.sbootapi.entities.concretes.Customer;

public interface ICustomerService {
	List<Customer> getAll();
	DataResult<List<Customer>> getByCompanyName(String companyName);
	DataResult<List<Customer>> getByContactName(String contactName);
	DataResult<List<Customer>> getByCity(String city);
	DataResult<List<Customer>> getByRegion(String region);
	Result addCustomer(CreateCustomerDto customerDto);
}
