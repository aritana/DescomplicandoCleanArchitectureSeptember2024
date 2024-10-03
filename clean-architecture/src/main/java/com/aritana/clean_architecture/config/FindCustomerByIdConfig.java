package com.aritana.clean_architecture.config;

import com.aritana.clean_architecture.core.dataprovider.FindCustomerById;
import com.aritana.clean_architecture.core.dataprovider.FindCustomerByIdImpl;
import com.aritana.clean_architecture.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCaseImpl findCustomerByIdUseCase(FindCustomerByIdImpl findCustomerById){
        return  new FindCustomerByIdUseCaseImpl(findCustomerById);
    }
}
