package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Product;
import com.endorodrigo.retofactus.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

    private final ProductRepository productRepositoty;

    public ItemServiceImpl(ProductRepository productRepositoty) {
        this.productRepositoty = productRepositoty;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = (List<Product>) productRepositoty.findAll();
        log.info("Lista de produtos: {}", products);
        return products;
    }

    @Override
    public Optional<Product> findById(Integer id) {

        return productRepositoty.findById(id);
    }

    @Override
    public Product save(Product product) {
        return productRepositoty.save(product);
    }

    @Override
    public void deleteById(Integer id) {
        productRepositoty.deleteById(id);
    }
}
