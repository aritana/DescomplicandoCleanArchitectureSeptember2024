package com.aritana.clean_architecture.entrypoint.consumer;

import com.aritana.clean_architecture.core.domain.Customer;
import com.aritana.clean_architecture.core.usecase.impl.UpdateCustomerUsecaseImpl;
import com.aritana.clean_architecture.entrypoint.consumer.mapper.CustomerMessageMapper;
import com.aritana.clean_architecture.entrypoint.consumer.message.CustomerMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveValidateCpfConsumer {

    @Autowired
    private UpdateCustomerUsecaseImpl updateCustomerUsecase;

    @Autowired
    private CustomerMessageMapper customerMessageMapper;

    @KafkaListener(topics = "tp-cpf-validated", groupId = "arantes")
    public void receive(CustomerMessage customerMessage){
        Customer customer = customerMessageMapper.toCustomer(customerMessage);
        updateCustomerUsecase.update(customer, customerMessage.getZipCode());
    }
}
