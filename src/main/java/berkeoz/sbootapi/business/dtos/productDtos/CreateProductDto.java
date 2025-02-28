package berkeoz.sbootapi.business.dtos.productDtos;

import berkeoz.sbootapi.entities.concretes.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductDto {
	private int id;
	private String productName;
	private double unitPrice;
	private short unitsInStock;
	private String quantityPerUnit;
	private Category category;
}
