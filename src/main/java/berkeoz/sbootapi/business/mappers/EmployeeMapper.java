package berkeoz.sbootapi.business.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import berkeoz.sbootapi.business.dtos.employeeDtos.CreateEmployeeDto;
import berkeoz.sbootapi.business.dtos.employeeDtos.EmployeeDto;
import berkeoz.sbootapi.entities.concretes.Employee;

@Mapper
public interface EmployeeMapper {
	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

	EmployeeDto employeeToEmployeeDto(Employee employee);
	
	@Mapping(target = "employeeId", ignore = true)
	Employee createEmployeeDtoToEmployee(CreateEmployeeDto createEmployeeDto);
}
