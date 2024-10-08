package com.aritana.clean_architecture.entrypoint.controller;

import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.core.usecase.DeleteCustomerByIdUseCase;
import com.aritana.clean_architecture.core.usecase.FindCustomerByIdUseCase;
import com.aritana.clean_architecture.core.usecase.InsertCustomerUseCase;
import com.aritana.clean_architecture.core.usecase.UpdateCustomerUsecase;
import com.aritana.clean_architecture.entrypoint.controller.mapper.CustomerMapper;
import com.aritana.clean_architecture.entrypoint.controller.request.CustomerRequest;
import com.aritana.clean_architecture.entrypoint.controller.response.CustomerResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustommerController {

    @Autowired
    private InsertCustomerUseCase insertCustomerUseCase;

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private FindCustomerByIdUseCase findCustomerByIdUseCase;

    @Autowired
    private UpdateCustomerUsecase updateCustomerUsecase;

    @Autowired
    private DeleteCustomerByIdUseCase deleteCustomerByIdUseCase;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);

        insertCustomerUseCase.insert(customer, customerRequest.getZipCode());

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable final String id) {
        Customer customer = findCustomerByIdUseCase.find(id);
        CustomerResponse customerResponse = customerMapper.toCustomerResponse(customer);

        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable final String id,
                                       @Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);

        updateCustomerUsecase.update(customer, customerRequest.getZipCode());

        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id) {
        deleteCustomerByIdUseCase.delete(id);
        return ResponseEntity.noContent().build();
    }

}
