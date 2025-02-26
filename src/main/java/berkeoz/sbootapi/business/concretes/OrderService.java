package berkeoz.sbootapi.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import berkeoz.sbootapi.business.abstracts.IOrderService;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.SuccessDataResult;
import berkeoz.sbootapi.dataAccess.abstracts.OrderDao;
import berkeoz.sbootapi.entities.concretes.Order;

@Service
public class OrderService implements IOrderService{

	private OrderDao orderDao;

	@Autowired
	public OrderService(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return this.orderDao.findAll();
	}

	@Override
	public DataResult<Order> getByEmployeeId(int employeeId) {
		return new SuccessDataResult<Order>(this.orderDao.getByEmployee_EmployeeId(employeeId), "Data shown.");
	}

	@Override
	public DataResult<List<Order>>getByCustomerId(String customerId) {
		return new SuccessDataResult<List<Order>>(this.orderDao.getByCustomer_CustomerId(customerId), "Data shown.");
	}
	
}
