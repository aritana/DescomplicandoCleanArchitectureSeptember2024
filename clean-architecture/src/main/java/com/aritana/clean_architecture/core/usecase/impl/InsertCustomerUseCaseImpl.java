package com.aritana.clean_architecture.core.usecase.impl;

import com.aritana.clean_architecture.core.dataprovider.FindAddressByZipCode;
import com.aritana.clean_architecture.core.dataprovider.InsertCustomer;
import com.aritana.clean_architecture.core.domain.Address;
import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.core.usecase.InsertCustomerUseCase;

public class InsertCustomerUseCaseImpl implements InsertCustomerUseCase {

    private final FindAddressByZipCode findAddressByZipCode;
    private final InsertCustomer insertCustomer;

    public InsertCustomerUseCaseImpl(FindAddressByZipCode findAddressByZipCode,InsertCustomer insertCustomer){
        this.findAddressByZipCode = findAddressByZipCode;
        this.insertCustomer = insertCustomer;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        Address address = findAddressByZipCode.find(zipCode);
        customer.setAddress(address);
        insertCustomer.insert(customer);
    }
}