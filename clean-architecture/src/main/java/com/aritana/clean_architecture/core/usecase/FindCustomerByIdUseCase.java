package com.aritana.clean_architecture.core.usecase;

import com.aritana.clean_architecture.core.domain.Customer;

public interface FindCustomerByIdUseCase {

    Customer find( final String id);
}
