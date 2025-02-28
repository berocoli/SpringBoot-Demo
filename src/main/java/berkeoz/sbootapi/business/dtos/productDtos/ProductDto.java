package berkeoz.sbootapi.business.dtos.productDtos;

import org.mapstruct.Mapper;

import berkeoz.sbootapi.entities.concretes.Category;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	private int id;
	private String productName;   
	private double unitPrice;    
	private short unitsInStock;   
	private String quantityPerUnit;
    private Category category;
}
