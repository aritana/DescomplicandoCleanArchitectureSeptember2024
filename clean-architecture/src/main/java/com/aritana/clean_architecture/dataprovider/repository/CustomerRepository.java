package com.aritana.clean_architecture.dataprovider.repository;

import com.aritana.clean_architecture.dataprovider.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

}
