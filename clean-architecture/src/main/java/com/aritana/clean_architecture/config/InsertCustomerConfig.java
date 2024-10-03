package com.aritana.clean_architecture.config;

import com.aritana.clean_architecture.core.dataprovider.FindAddressByZipCode;
import com.aritana.clean_architecture.core.dataprovider.InsertCustomer;
import com.aritana.clean_architecture.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.aritana.clean_architecture.dataprovider.FindAddressByZipCodeImpl;
import com.aritana.clean_architecture.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode,
                                                           InsertCustomerImpl insertCustomer) {

        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer);
    }
}
