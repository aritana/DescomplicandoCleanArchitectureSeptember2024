package com.aritana.clean_architecture.core.dataprovider;

import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.dataprovider.entity.CustomerEntity;
import com.aritana.clean_architecture.dataprovider.repository.CustomerRepository;
import com.aritana.clean_architecture.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdImpl implements FindCustomerById{

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity->customerEntityMapper.toCustomer(entity));
    }
}
