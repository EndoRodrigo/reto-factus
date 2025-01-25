package com.endorodrigo.retofactus.repository;

import com.endorodrigo.retofactus.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepository extends CrudRepository<Customer,Long> {

}
