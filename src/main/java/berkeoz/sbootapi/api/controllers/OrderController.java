package berkeoz.sbootapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import berkeoz.sbootapi.business.abstracts.IOrderService;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.entities.concretes.Order;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	private IOrderService orderService;

	@Autowired
	public OrderController(IOrderService orderService) {
		this.orderService = orderService;
	}

	@GetMapping("/getall")
	public List<Order> getAll(){
		return this.orderService.getAll();
	}
	
	@GetMapping("/get-by-employee-id")
	public DataResult<Order> getByEmployeeId(int employeeId){
		return this.orderService.getByEmployeeId(employeeId);
	}
	
	@GetMapping("/get-by-customer-id")
	public DataResult<List<Order>> getByCustomerId(String customerId){
		return this.orderService.getByCustomerId(customerId);
	}
}
