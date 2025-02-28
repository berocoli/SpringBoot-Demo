package berkeoz.sbootapi.business.dtos.employeeDtos;

import java.util.List;
import berkeoz.sbootapi.entities.concretes.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateEmployeeDto {
	private int employeeId;	
	private String lastName;	
	private String firstName;	
	private String title;	
	private String titleOfCourtesy;	
	private String birthDate;
	private String hireDate;
	private String adress;
	private String city;	
	private String region;
	private String postalCode;
	private String country;
	private String homePhone;
	private String extension;
	private byte[] photo;
	private String notes;
	private Integer reportsTo;
	private String photoPath;
}
