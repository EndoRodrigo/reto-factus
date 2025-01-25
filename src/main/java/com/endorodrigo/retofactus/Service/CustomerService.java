package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
    Customer save(Customer product);
    void deleteById(Long id);
}
