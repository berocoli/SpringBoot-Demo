package berkeoz.sbootapi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import berkeoz.sbootapi.business.abstracts.ICustomerService;
import berkeoz.sbootapi.business.dtos.customerDtos.CreateCustomerDto;
import berkeoz.sbootapi.business.mappers.CustomerMapper;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.Result;
import berkeoz.sbootapi.core.utilities.results.SuccessDataResult;
import berkeoz.sbootapi.core.utilities.results.SuccessResult;
import berkeoz.sbootapi.dataAccess.abstracts.CustomerDao;
import berkeoz.sbootapi.entities.concretes.Customer;

@Service
public class CustomerService implements ICustomerService {

	private CustomerDao customerDao;
	private final CustomerMapper customerMapper;

	@Autowired
	public CustomerService(CustomerDao customerDao, CustomerMapper customerMapper) {
		super();
		this.customerDao = customerDao;
		this.customerMapper = customerMapper;
	}

	@Override
	public List<Customer> getAll() {
		return this.customerDao.findAll();
	}

	@Override
	public DataResult<List<Customer>> getByCompanyName(String companyName) {
		return new SuccessDataResult<List<Customer>>(this.customerDao.getByCompanyName(companyName));
	}

	@Override
	public DataResult<List<Customer>> getByContactName(String contactName) {
		return new SuccessDataResult<List<Customer>>(this.customerDao.getByContactName(contactName));
	}

	@Override
	public DataResult<List<Customer>> getByCity(String city) {
		return new SuccessDataResult<List<Customer>>(this.customerDao.getByCity(city));
	}

	@Override
	public DataResult<List<Customer>> getByRegion(String region) {
		return new SuccessDataResult<List<Customer>>(this.customerDao.getByRegion(region));
	}
	
	@Override
	public Result addCustomer(CreateCustomerDto customerDto) {
	    Customer customer = customerMapper.createCustomerDtoToCustomer(customerDto);
	    
	    if (customer.getCustomerId() == null || customer.getCustomerId().isEmpty()) {
	        customer.setCustomerId(generateCustomerId(customerDto)); // Generate an ID if missing
	    }

	    this.customerDao.save(customer);
	    return new SuccessResult("Customer Added.");
	}

	// Generate a unique string ID based on name and surname
	private String generateCustomerId(CreateCustomerDto dto) {
	    return (dto.getCompanyName().substring(0, 3) + dto.getContactName().substring(0, 2)).toUpperCase();
	}

}
