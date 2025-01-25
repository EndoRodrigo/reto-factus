package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Product;

import java.util.List;
import java.util.Optional;

public class ItemServiceImpl implements ItemService {

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
