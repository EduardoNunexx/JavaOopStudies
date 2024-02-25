package br.com.end.demo01.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.end.demo01.model.entities.Product;

public interface ProductsRepository extends CrudRepository<Product, Integer>{
	 
}
