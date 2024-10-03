package com.aritana.clean_architecture.dataprovider.repository.mapper;

import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.dataprovider.entity.CustomerEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCostumer(CustomerEntity customerEntity);
}
