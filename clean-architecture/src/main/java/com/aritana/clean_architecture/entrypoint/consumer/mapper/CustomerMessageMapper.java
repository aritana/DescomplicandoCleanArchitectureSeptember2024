package com.aritana.clean_architecture.entrypoint.consumer.mapper;

import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.entrypoint.consumer.message.CustomerMessage;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    Customer toCustomer(CustomerMessage customerMessage);

}
