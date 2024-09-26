package com.aritana.clean_architecture.dataprovider.dataprovider.client.mapper;

import com.aritana.clean_architecture.core.domain.Address;
import com.aritana.clean_architecture.dataprovider.dataprovider.client.Response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}