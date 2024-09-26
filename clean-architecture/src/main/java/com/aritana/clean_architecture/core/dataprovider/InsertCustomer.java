package com.aritana.clean_architecture.core.dataprovider;

import com.aritana.clean_architecture.core.domain.Customer;

public interface InsertCustomer {
    void insert(Customer customer);
}
