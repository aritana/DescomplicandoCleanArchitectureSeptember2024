package com.aritana.clean_architecture.dataprovider.entity;

import lombok.Data;

@Data
public class AddressEntity {
    private String street;
    private String city;
    private String state;
}