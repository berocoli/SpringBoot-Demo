package berkeoz.sbootapi.business.dtos.orderDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderDto {
    private int customerId;
    private int employeeId;
    private String orderDate;
    private String requiredDate;
    private String shippedDate;
    private int shipVia;
    private String shipCity;
    private String shipRegion;
    private String shipPostalCode;
    private String shipCountry;
}
