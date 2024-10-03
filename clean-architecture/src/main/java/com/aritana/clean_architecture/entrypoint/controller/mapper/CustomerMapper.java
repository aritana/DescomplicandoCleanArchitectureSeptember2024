package com.aritana.clean_architecture.entrypoint.controller.mapper;

import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.entrypoint.controller.request.CustomerRequest;
import com.aritana.clean_architecture.entrypoint.controller.response.CustomerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    @Mapping(target = "id",ignore = true)
    @Mapping(target = "address",ignore = true)
    @Mapping(target = "isValidCpf",ignore = true)
    Customer toCustomer(CustomerRequest customerRequest);

    CustomerResponse toCustomerResponse(Customer customer);

}