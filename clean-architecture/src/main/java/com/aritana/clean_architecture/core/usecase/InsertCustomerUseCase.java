package com.aritana.clean_architecture.core.usecase;

import com.aritana.clean_architecture.core.domain.Customer;

public interface InsertCustomerUseCase {

    void insert(Customer customer, String zipCode);
}