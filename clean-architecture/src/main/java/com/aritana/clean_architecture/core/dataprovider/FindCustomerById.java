package com.aritana.clean_architecture.core.dataprovider;

import com.aritana.clean_architecture.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerById {
    Optional<Customer> find(final String id);
}
