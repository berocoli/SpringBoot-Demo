package berkeoz.sbootapi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import berkeoz.sbootapi.business.abstracts.ICustomerService;
import berkeoz.sbootapi.dataAccess.abstracts.CustomerDao;
import berkeoz.sbootapi.entities.concretes.Customer;

@Service
public class CustomerService implements ICustomerService{

	private CustomerDao customerDao;
	
	@Autowired
	public CustomerService(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public List<Customer> getAll() {
		return this.customerDao.findAll();
	}

	@Override
	public Task addCustomer(){
		return null;
	}
}
