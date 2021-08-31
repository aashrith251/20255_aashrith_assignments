package com.sonata.Controller;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.sonata.Model.Product;
import com.sonata.Repository.ProductRepository;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@RequestMapping("/api/v1")

public class ProductController {
	
	Optional<Product> p1;
	
	@Autowired
	private ProductRepository prepository;
	
	@GetMapping("/products")
	public List<Product> getAllProducts()
	{
		return prepository.findAll();
	}
	
	@GetMapping(value= "/products/{id}")
	public ResponseEntity getProductsById(@PathVariable(value="id") Long pId)
	{
		p1= prepository.findById(pId);
		return ResponseEntity.ok().body(p1);
	}
	
	@PostMapping(value = "/products")
	public Product saveProduct(@RequestBody Product prod)
	{
		return prepository.save(prod);
	}
	
	@PutMapping(value="/products/{id}")
	public ResponseEntity updateProduct(@PathVariable(value="id") Long pId, @Valid @RequestBody Product pdata) {
		p1 = prepository.findById(pId);
		Product p2 = p1.get();
		
		p2.setpId(pdata.getpId());
		p2.setpName(pdata.getpName());
		p2.setpPrice(pdata.getpPrice());
		
		Product updateProduct = prepository.save(p2);
		return ResponseEntity.ok(updateProduct);
	}
	
	@DeleteMapping(value="/products/{id}")
	public ResponseEntity deleteProduct(@PathVariable(value="id")Long pId) {
		prepository.deleteById(pId);
		return ResponseEntity.noContent().build();
	}


}