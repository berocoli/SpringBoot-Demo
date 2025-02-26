package berkeoz.sbootapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import berkeoz.sbootapi.business.abstracts.ICustomerService;
import berkeoz.sbootapi.entities.concretes.Customer;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	private ICustomerService customerService;

	@Autowired
	public CustomerController(ICustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/getall")
	public List<Customer> getAll(){
		return this.customerService.getAll();
	} 
}
