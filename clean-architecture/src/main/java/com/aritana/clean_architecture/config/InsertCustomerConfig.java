package com.aritana.clean_architecture.config;

import com.aritana.clean_architecture.core.dataprovider.SendCpfForValidation;
import com.aritana.clean_architecture.core.usecase.impl.InsertCustomerUseCaseImpl;
import com.aritana.clean_architecture.dataprovider.FindAddressByZipCodeImpl;
import com.aritana.clean_architecture.dataprovider.InsertCustomerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCaseImpl insertCustomerUseCase(FindAddressByZipCodeImpl findAddressByZipCode,
                                                           InsertCustomerImpl insertCustomer,
                                                           SendCpfForValidation sendCpfForValidation) {

        return new InsertCustomerUseCaseImpl(findAddressByZipCode, insertCustomer, sendCpfForValidation);
    }
}
