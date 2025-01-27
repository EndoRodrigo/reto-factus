package com.endorodrigo.retofactus.Service;

import com.endorodrigo.retofactus.model.Customer;
import com.endorodrigo.retofactus.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        List<Customer> findCustomers = (List<Customer>) customerRepository.findAll();
        log.info("Find all customers: {}", findCustomers);
        return findCustomers;
    }

    @Override
    public Optional<Customer> findByIdentification(String id) {
        Optional<Customer> findCustomer = customerRepository.findByIdentification(id).stream().findFirst();
        log.info("Find customer: {}", findCustomer);
        return findCustomer;
    }

    @Override
    public Customer save(Customer product) {
        log.info("Save customer: {}", product);
        return customerRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
        customerRepository.deleteById(id);
    }
}
