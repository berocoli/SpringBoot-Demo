package berkeoz.sbootapi.business.abstracts;

import java.util.List;

import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.Result;
import berkeoz.sbootapi.entities.concretes.Product;

public interface IProductService
{
	DataResult<List<Product>> getAll();
	
	DataResult<List<Product>> getAll(int pageNumber, int pageSize);

	Result add(Product product);

	DataResult<Product> getByProductName(String productName);

	DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);

	DataResult<List<Product>> getByCategoryIn(List<Integer> categoryIds);

	DataResult<List<Product>> getByProductNameContains(String productName);

	DataResult<List<Product>> getByProductNameStartsWith(String productName);

	DataResult<List<Product>> getByNameOrCategory(String productName, int categoryId);
}
