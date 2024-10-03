package com.aritana.clean_architecture.core.usecase.impl;

import com.aritana.clean_architecture.core.dataprovider.FindAddressByZipCode;
import com.aritana.clean_architecture.core.dataprovider.UpdateCustomer;
import com.aritana.clean_architecture.core.domain.Address;
import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.core.usecase.FindCustomerByIdUseCase;
import com.aritana.clean_architecture.core.usecase.UpdateCustomerUsecase;

public class UpdateCustomerUsecaseImpl implements UpdateCustomerUsecase {

    private final FindCustomerByIdUseCase findCustomerByIdUseCase;
    private final FindAddressByZipCode findAddressByZipCode;
    private final UpdateCustomer updateCustomer;

    public UpdateCustomerUsecaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                     FindAddressByZipCode findAddressByZipCode,
                                     UpdateCustomer updateCustomer){
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.findAddressByZipCode = findAddressByZipCode;
        this.updateCustomer = updateCustomer;
    }
    @Override
    public void update(Customer customer, String zipCode) {
        this.findCustomerByIdUseCase.find(customer.getId());
        Address address = this.findAddressByZipCode.find(zipCode);
        customer.setAddress(address);

        updateCustomer.update(customer);
    }
}
