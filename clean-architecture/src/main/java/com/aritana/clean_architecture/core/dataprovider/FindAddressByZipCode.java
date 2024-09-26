package com.aritana.clean_architecture.core.dataprovider;

import com.aritana.clean_architecture.core.domain.Address;

public interface FindAddressByZipCode {

    Address find(final String zipCode);
}