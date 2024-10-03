package com.aritana.clean_architecture.dataprovider;

import com.aritana.clean_architecture.core.dataprovider.InsertCustomer;
import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.dataprovider.repository.CustomerRepository;
import com.aritana.clean_architecture.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerImpl implements InsertCustomer {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        customerRepository.save(customerEntityMapper.toCustomerEntity(customer));
    }
}
