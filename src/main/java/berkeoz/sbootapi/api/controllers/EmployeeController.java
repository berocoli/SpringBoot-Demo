package berkeoz.sbootapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import berkeoz.sbootapi.business.abstracts.IEmployeeService;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.entities.concretes.Employee;
import jakarta.annotation.Nullable;
import lombok.Data;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private IEmployeeService employeeService;

	@Autowired
	public EmployeeController(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/getallagain")
	public DataResult<List<Employee>> getAllAgain() {
		return this.employeeService.getAll();
	}

	@GetMapping("/get-by-name")
	public DataResult<Employee> getByName(String firstName, @Nullable String lastName) {
		return this.employeeService.getByFirstNameAndLastName(firstName, lastName);
	}

	@GetMapping("/get-by-title")
	public DataResult<List<Employee>> getByTitle(String title) {
		return this.employeeService.getByTitle(title);
	}

	@GetMapping("/get-by-title-of-courtesy")
	public DataResult<List<Employee>> getByTitleOfCourtesy(String titleOfCourtesy) {
		return this.employeeService.getByTitleOfCourtesy(titleOfCourtesy);
	}

	@GetMapping("/get-by-country")
	public DataResult<List<Employee>> getByCountry(String country) {
		return this.employeeService.getByCountry(country);
	}

	@GetMapping("/get-by-region")
	public DataResult<List<Employee>> getByRegion(String region) {
		return this.employeeService.getByRegion(region);
	}

}
