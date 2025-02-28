package berkeoz.sbootapi.business.concretes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Pageable;
import org.apache.logging.log4j.CloseableThreadContext.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import berkeoz.sbootapi.business.abstracts.IProductService;
import berkeoz.sbootapi.business.dtos.productDtos.PaginatedProductDto;
import berkeoz.sbootapi.business.dtos.productDtos.ProductDto;
import berkeoz.sbootapi.business.mappers.ProductMapper;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.Result;
import berkeoz.sbootapi.core.utilities.results.SuccessDataResult;
import berkeoz.sbootapi.core.utilities.results.SuccessResult;
import berkeoz.sbootapi.dataAccess.abstracts.ProductDao;
import berkeoz.sbootapi.entities.concretes.Product;

@Service
public class ProductService implements IProductService {

	private ProductDao productDao;
	private final ProductMapper mapper;

	@Autowired
	public ProductService(ProductDao productDao, ProductMapper mapper) {
		this.productDao = productDao;
		this.mapper = mapper;
	}

	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data listed.");
	}
	
	@Override
	public DataResult<PaginatedProductDto> getAll(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
        Page<Product> productPage = productDao.findAll(pageable);

        // Convert List<Product> to List<ProductDto>
        List<ProductDto> productDtos = mapper.toProductDtoList(productPage.getContent());

        // Create DTO response
        PaginatedProductDto response = new PaginatedProductDto(productDtos, productPage.getTotalPages());

	    
	    return new SuccessDataResult<>(response);
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Product added.");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName), "Data shown.");
	}

	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<Product>(
				this.productDao.getByProductNameAndCategory_CategoryId(productName, categoryId), "Data shown.");
	}

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categoryIds) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByCategoryIn(categoryIds), "Data shown.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName),
				"Data shown.");
	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName),
				"Data shown.");
	}

	@Override
	public DataResult<List<Product>> getByNameOrCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(
				this.productDao.getByProductNameOrCategory_CategoryId(productName, categoryId), "Data shown.");
	}
}
