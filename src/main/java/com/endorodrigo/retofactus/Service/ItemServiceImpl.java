package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Items;
import com.endorodrigo.retofactus.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

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
    public List<Items> findAll() {
        List<Items> products = (List<Items>) productRepositoty.findAll();
        log.info("Lista de produtos: {}", products);
        return products;
    }

    @Override
    public Optional<Items> findById(String id) {
        Optional<Items> product = productRepositoty.findByName(id);
        log.info("Produto encontrado: {}", product);
        return product;
    }

    @Override
    public Items save(Items product) {
        return productRepositoty.save(product);
    }

    @Override
    public void deleteById(Integer id) {
        productRepositoty.deleteById(id);
    }
}
