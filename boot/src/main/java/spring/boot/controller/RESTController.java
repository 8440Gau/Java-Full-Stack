package spring.boot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.demo.controllerexception.ProductNotFoundException;
import spring.boot.entity.Product;

@RestController
@RequestMapping("Main")
public class RESTController {
@RequestMapping("/Hello")
public String Hello() {
	return "Hello";
}
private static Map<String, Product> productRepo = new HashMap<>();
static {
    Product honey = new Product();
    honey.setId("1");
    honey.setName("Honey");
    productRepo.put(honey.getId(), honey);
    
    Product almond = new Product();
    almond.setId("2");
    almond.setName("Almond");
    productRepo.put(almond.getId(), almond);
 }

@RequestMapping(value="/product/{id]",method= RequestMethod.PUT)
public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product){
	
	if(!productRepo.containsKey(id))throw new ProductNotFoundException();
    productRepo.remove(id);
    product.setId(id);
    productRepo.put(id, product);
    return new ResponseEntity<>("Product is updated successfully", HttpStatus.OK);
}


}
