package com.endorodrigo.retofactus.repository;

import com.endorodrigo.retofactus.model.Items;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProductRepository extends CrudRepository<Items, Integer> {
    Optional<Items> findByName(String id);
}
