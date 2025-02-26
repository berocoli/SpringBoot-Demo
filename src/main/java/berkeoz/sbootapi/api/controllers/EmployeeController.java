package berkeoz.sbootapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import berkeoz.sbootapi.business.abstracts.IEmployeeService;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.entities.concretes.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	private IEmployeeService employeeService;
	@Autowired
	public EmployeeController(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping("/getallagain")
	public DataResult<List<Employee>> getAllAgain(){
		return this.employeeService.getAll();
	}
}
