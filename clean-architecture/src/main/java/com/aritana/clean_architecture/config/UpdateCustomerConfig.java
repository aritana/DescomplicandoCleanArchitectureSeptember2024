package com.aritana.clean_architecture.config;

import com.aritana.clean_architecture.core.dataprovider.FindAddressByZipCode;
import com.aritana.clean_architecture.core.dataprovider.UpdateCustomer;
import com.aritana.clean_architecture.core.dataprovider.UpdateCustomerImpl;
import com.aritana.clean_architecture.core.usecase.FindCustomerByIdUseCase;
import com.aritana.clean_architecture.core.usecase.impl.FindCustomerByIdUseCaseImpl;
import com.aritana.clean_architecture.core.usecase.impl.UpdateCustomerUsecaseImpl;
import com.aritana.clean_architecture.dataprovider.FindAddressByZipCodeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUsecaseImpl updateCustomerUsecase(FindCustomerByIdUseCaseImpl findCustomerByIdUseCase,
                                                           FindAddressByZipCodeImpl findAddressByZipCode,
                                                           UpdateCustomerImpl updateCustomer) {
        return new UpdateCustomerUsecaseImpl(findCustomerByIdUseCase, findAddressByZipCode, updateCustomer);
    }

}
