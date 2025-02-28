package berkeoz.sbootapi.business.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import berkeoz.sbootapi.business.dtos.orderDtos.CreateOrderDto;
import berkeoz.sbootapi.business.dtos.orderDtos.OrderDto;
import berkeoz.sbootapi.entities.concretes.Order;

@Mapper
public interface OrderMapper {
	OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
	
	OrderDto orderToOrderDto(Order order);
	
	@Mapping(target = "orderId", ignore = true)
	Order CreateOrderDtoToOrder(CreateOrderDto createOrderDto);
}
