package berkeoz.sbootapi.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import berkeoz.sbootapi.business.abstracts.IProductService;
import berkeoz.sbootapi.core.utilities.results.DataResult;
import berkeoz.sbootapi.core.utilities.results.Result;
import berkeoz.sbootapi.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	private IProductService productService;

	@Autowired
	public ProductController(IProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
	}
	
	@GetMapping("/getall_pages")
	public DataResult<List<Product>> getAll(int pageNumber, int pageSize){
		return this.productService.getAll(pageNumber, pageSize);
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {
		return this.productService.add(product);
	}

	@GetMapping("/get_by_product_name")
	public DataResult<Product> getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}

	@GetMapping("/get_by_product_name_and_category_id")
	public DataResult<Product> getByProductNameAndCategoryId(@RequestParam("productName") String productName, @RequestParam("categoryId") int categoryId){
		return this.productService.getByProductNameAndCategory(productName, categoryId);
	}

	@GetMapping("/get_by_category_id_in")
	public DataResult<List<Product>> getByCategoryIn(@RequestParam List<Integer> categoryId){
		return this.productService.getByCategoryIn(categoryId);
	}

	@GetMapping("/get_by_product_name_contains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName){
		return this.productService.getByProductNameContains(productName);
	}

	@GetMapping("/get_by_product_name_starts_with")
	public DataResult<List<Product>> getByProductNameStartsWith(@RequestParam String productName){
		return this.productService.getByProductNameStartsWith(productName);
	}
	
	@GetMapping("/get_by_name_or_category")
	public DataResult<List<Product>> getByNameAndCategory(@RequestParam String productName, @RequestParam int categoryId){
		return this.productService.getByNameOrCategory(productName, categoryId);
	}
}
