package com.example.shop.contollers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.shop.entityes.Product;
import com.example.shop.repositories.ProductRepository;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository rep;
	
	@RequestMapping("/product_by_id")
	public Optional<Product> productById (@RequestParam(value="id") long id) {
    return rep.findById(id);
	}
	
	@RequestMapping("/set_product")
	public void set (@RequestParam(value="id") long id, @RequestParam(value="name")String name, @RequestParam(value="description")String description) {
		Product product = new Product();
		product.setId(id);
		product.setName(name);
		product.setDescription(description);
    rep.save(product);
	}
}
