package berkeoz.sbootapi.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import berkeoz.sbootapi.entities.concretes.Order;

public interface OrderDao extends JpaRepository<Order, Integer>{
	Order getByEmployee_EmployeeId(int employeeId);
	List<Order> getByCustomer_CustomerId(String customerId);	
}
