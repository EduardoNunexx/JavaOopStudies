package br.com.end.demo01.model.repositories;

import org.springframework.data.repository.*;

import br.com.end.demo01.model.entities.Product;

public interface ProductsRepository extends PagingAndSortingRepository<Product, Integer>, CrudRepository<Product,Integer>{
	 public Iterable<Product> findByNameContaining(String name);
}
