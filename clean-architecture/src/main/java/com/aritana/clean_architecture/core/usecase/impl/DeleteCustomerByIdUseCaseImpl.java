package com.aritana.clean_architecture.core.usecase.impl;

import com.aritana.clean_architecture.core.dataprovider.DeleteCustomerById;
import com.aritana.clean_architecture.core.usecase.DeleteCustomerByIdUseCase;
import com.aritana.clean_architecture.core.usecase.FindCustomerByIdUseCase;

public class DeleteCustomerByIdUseCaseImpl implements DeleteCustomerByIdUseCase {

    FindCustomerByIdUseCase findCustomerByIdUseCase;
    DeleteCustomerById deleteCustomerById;

    public DeleteCustomerByIdUseCaseImpl(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                         DeleteCustomerById deleteCustomerById){
        this.findCustomerByIdUseCase = findCustomerByIdUseCase;
        this.deleteCustomerById = deleteCustomerById;
    }

    @Override
    public void delete(String id) {
        this.findCustomerByIdUseCase.find(id);
        this.deleteCustomerById.delete(id);
    }
}
