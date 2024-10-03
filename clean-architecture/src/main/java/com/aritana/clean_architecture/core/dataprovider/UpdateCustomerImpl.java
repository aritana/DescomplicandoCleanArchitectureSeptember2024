package com.aritana.clean_architecture.core.dataprovider;

import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.dataprovider.entity.CustomerEntity;
import com.aritana.clean_architecture.dataprovider.repository.CustomerRepository;
import com.aritana.clean_architecture.dataprovider.repository.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerImpl implements  UpdateCustomer{

    @Autowired
    CustomerEntityMapper customerEntityMapper;

   @Autowired
   private CustomerRepository customerRepository;

    @Override
    public void update(Customer customer) {
        customerRepository.save(customerEntityMapper.toCustomerEntity(customer));
    }
}
