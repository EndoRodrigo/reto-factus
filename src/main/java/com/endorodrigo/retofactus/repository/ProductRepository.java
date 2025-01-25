package com.endorodrigo.retofactus.repository;

import com.endorodrigo.retofactus.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
