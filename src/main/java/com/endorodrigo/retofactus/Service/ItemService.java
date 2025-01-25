package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Product;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Product> findAll();
    Optional<Product> findById(Integer id);
    Product save(Product product);
    void deleteById(Integer id);

}
