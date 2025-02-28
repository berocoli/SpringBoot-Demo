package berkeoz.sbootapi.business.dtos.productDtos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaginatedProductDto {
	private List<ProductDto> data;
	private int totalPages;
}
