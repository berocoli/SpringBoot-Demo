package berkeoz.sbootapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import berkeoz.sbootapi.business.abstracts.ICustomerService;
import berkeoz.sbootapi.business.dtos.customerDtos.CreateCustomerDto;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.Result;
import berkeoz.sbootapi.core.utilities.results.SuccessDataResult;
import berkeoz.sbootapi.core.utilities.results.SuccessResult;
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
	public List<Customer> getAll() {
		return this.customerService.getAll();
	}

	@GetMapping("/get-by-company-name")
	public DataResult<List<Customer>> getByCompanyName(String companyName) {
		return this.customerService.getByCompanyName(companyName);
	}

	@GetMapping("/get-by-contact-name")
	public DataResult<List<Customer>> getByContactName(String contactName) {
		return this.customerService.getByContactName(contactName);
	}

	@GetMapping("/get-by-city")
	public DataResult<List<Customer>> getByCity(String city) {
		return this.customerService.getByCity(city);
	}

	@GetMapping("/get-by-region")
	public DataResult<List<Customer>> getByRegion(String region) {
		return this.customerService.getByRegion(region);
	}
	
	@PostMapping("/add-customer")
	public Result addCustomer(CreateCustomerDto createCustomerDto){
		this.customerService.addCustomer(createCustomerDto);
		return new SuccessResult("Customer created.");
	}
}
