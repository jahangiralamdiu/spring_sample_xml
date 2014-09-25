package com.pluralsight.service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;
import com.pluralsight.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by lenovo on 25/09/2014.
 */
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll()
    {
        return customerRepository.findAll();
    }
}
