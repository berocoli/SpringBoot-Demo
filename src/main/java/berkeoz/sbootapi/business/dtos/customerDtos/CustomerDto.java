package berkeoz.sbootapi.business.dtos.customerDtos;

import java.util.List;

import berkeoz.sbootapi.entities.concretes.Order;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
// From down here this is a POJO example 
public class CustomerDto {
	private String companyName;
	private String contactName;
	private String contactTitle;
	private String address;
	private String city;
	private String region;
	private String postalCode;
	private String country;
	private String phone;
	private String fax;
}
