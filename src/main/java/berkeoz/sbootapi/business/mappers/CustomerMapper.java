package berkeoz.sbootapi.business.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import berkeoz.sbootapi.business.dtos.customerDtos.CreateCustomerDto;
import berkeoz.sbootapi.business.dtos.customerDtos.CustomerDto;
import berkeoz.sbootapi.entities.concretes.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
	
	CustomerDto customerToCustomerDto(Customer customer);
	
	@Mapping(target = "customerId", ignore = false)
	Customer createCustomerDtoToCustomer(CreateCustomerDto createCustomerDto);
}
