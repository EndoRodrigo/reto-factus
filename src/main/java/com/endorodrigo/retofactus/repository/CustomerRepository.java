package com.endorodrigo.retofactus.repository;

import com.endorodrigo.retofactus.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface CustomerRepository extends CrudRepository<Customer,Long> {
    Optional<Customer> findByIdentification(String identification);
}
