package com.aritana.clean_architecture.core.usecase.impl;

import com.aritana.clean_architecture.core.dataprovider.FindCustomerById;
import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.core.usecase.FindCustomerByIdUseCase;

public class FindCustomerByIdUseCaseImpl implements FindCustomerByIdUseCase {
    private final FindCustomerById findCustomerById;

    public  FindCustomerByIdUseCaseImpl(FindCustomerById findCustomerById) {
        this.findCustomerById = findCustomerById;
    }

    @Override
    public Customer find(String id) {
        return findCustomerById.find(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
