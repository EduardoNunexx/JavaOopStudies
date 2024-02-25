package br.com.end.demo01.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import br.com.end.demo01.model.entities.Product;
import br.com.end.demo01.model.repositories.ProductsRepository;
import jakarta.validation.Valid;

import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductsRepository productsRepository;
	@PostMapping
	public Product newProduct(@RequestParam(name = "name") String name,@RequestParam(name = "price") double price,@RequestParam(name = "discount") double discount) {
		Product product = new Product(name,price,discount);
		productsRepository.save(product);
		return product;
	}
	//the simple way to create an object catching this attributes by URL
	@PostMapping("/simpleWay")
		//using the annotation@ valid to set that this creation must to be valid by the params that you have seted on the entity 
	public Product newProduct(@Valid Product product) {
		productsRepository.save(product);
		return product;
	}

	//getting all database values
	@GetMapping
	public Iterable<Product>getAllProducts(){
		//findAll will return a iterable interface so you must to turn this iterable on the class type that you want
		return productsRepository.findAll();
	}
	//getting values by id
	@GetMapping(path = "/{id}")
	public Optional<Product> getById(@PathVariable int id){
		//this method will return a optional, cause u can send an id that dont exist in the dataBase
		//so you must turn this optional using Generics
		return productsRepository.findById(id);
	}
}
