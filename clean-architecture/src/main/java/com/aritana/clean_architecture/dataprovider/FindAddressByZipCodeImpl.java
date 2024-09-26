package com.aritana.clean_architecture.dataprovider;

import com.aritana.clean_architecture.core.dataprovider.FindAddressByZipCode;
import com.aritana.clean_architecture.core.domain.Address;
import com.aritana.clean_architecture.dataprovider.dataprovider.client.FindAddressByZipCodeClient;
import com.aritana.clean_architecture.dataprovider.dataprovider.client.Response.AddressResponse;
import com.aritana.clean_architecture.dataprovider.dataprovider.client.mapper.AddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements FindAddressByZipCode {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        AddressResponse addressResponse = findAddressByZipCodeClient.find(zipCode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}