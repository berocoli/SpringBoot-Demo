package berkeoz.sbootapi.business.abstracts;

import java.util.List;

import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.entities.concretes.Order;

public interface IOrderService {
	List<Order> getAll();
	DataResult<Order> getByEmployeeId(int employeeId);
	DataResult<List<Order>> getByCustomerId(String customerId);
}
