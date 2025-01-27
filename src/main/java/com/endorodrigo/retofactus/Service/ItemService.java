package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Items;

import java.util.List;
import java.util.Optional;

public interface ItemService {

    List<Items> findAll();
    Optional<Items> findById(String id);
    Items save(Items product);
    void deleteById(Integer id);

}
