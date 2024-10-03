package com.aritana.clean_architecture.config;


import com.aritana.clean_architecture.core.dataprovider.DeleteCustomerById;
import com.aritana.clean_architecture.core.dataprovider.DeleteCustomerByIdImpl;
import com.aritana.clean_architecture.core.usecase.FindCustomerByIdUseCase;
import com.aritana.clean_architecture.core.usecase.impl.DeleteCustomerByIdUseCaseImpl;
import com.aritana.clean_architecture.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCaseImpl deleteCustomerByIdUseCase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
                                                                   DeleteCustomerByIdImpl deleteCustomerById) {
        return new DeleteCustomerByIdUseCaseImpl(findCustomerByIdUseCase, deleteCustomerById);
    }
}