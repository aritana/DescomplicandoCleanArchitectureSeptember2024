package com.aritana.clean_architecture.dataprovider.client.Response;

import lombok.Data;

@Data
public class AddressResponse {
    private String street;
    private String city;
    private String state;
}