package berkeoz.sbootapi.business.abstracts;

import java.util.List;

import org.springframework.scheduling.config.Task;

import berkeoz.sbootapi.entities.concretes.Customer;

public interface ICustomerService {
	List<Customer> getAll();
	Task addCustomer();
}
