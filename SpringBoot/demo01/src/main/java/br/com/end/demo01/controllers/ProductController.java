package br.com.end.demo01.controllers;

import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
    //edit products
    //using valid to check if you receive  valid product
    @PutMapping
    public Product editProduct(@Valid Product product){
        productsRepository.save(product);
        return product;
    }
	//the second e way edit the data
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}, path = "/editOrAdd")
	public Product editOrAddProduct(@Valid Product product){
		productsRepository.save(product);
		return product;
	}
	//deleting values
	@DeleteMapping(path = "/{id}")
	public void deleteProduct(@PathVariable int id){
			productsRepository.deleteById(id);
	}
    //pagination gets
    @GetMapping(path = "/pag/{pageNumber}/{qtdElements}")
    public Iterable<Product> getProductsByPage(@PathVariable int pageNumber, @PathVariable int qtdElements){
        //instancing the pageable and giving the currently number page and how many elements each pages will have
        Pageable page = PageRequest.of(pageNumber,qtdElements);
        return productsRepository.findAll(page);
    }
	//getting by name
	@GetMapping(path = "/name/{namePart}")
	public Iterable<Product> getProductsByName(@PathVariable String namePart){
		return productsRepository.findByNameContaining(namePart);
	}

}
