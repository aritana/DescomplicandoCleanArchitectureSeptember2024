package com.aritana.clean_architecture.core.usecase;

import com.aritana.clean_architecture.core.domain.Customer;

public interface UpdateCustomerUsecase {
    void update(Customer customer, String zipCode);
}
