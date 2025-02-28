package berkeoz.sbootapi.business.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

import berkeoz.sbootapi.business.dtos.productDtos.ProductDto;
import berkeoz.sbootapi.entities.concretes.Product;


@Mapper(componentModel = "spring")
public interface ProductMapper {
	@Mapping(target = "productId", ignore = false)
	ProductDto productToProductDto(Product product);
	
	@Mapping(target = "productId", ignore = true)
	Product createProductDtoToProduct(ProductDto productDto); 
	
	@Mapping(target = "productId", ignore = false)
	List<ProductDto> toProductDtoList(List<Product> product);
}
