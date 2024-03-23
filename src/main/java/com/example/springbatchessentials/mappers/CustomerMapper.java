package com.example.springbatchessentials.mappers;

import com.example.springbatchessentials.dto.CustomerDTO;
import com.example.springbatchessentials.entities.Customer;

public interface CustomerMapper {

    Customer from(CustomerDTO customerDTO);

    CustomerDTO from(Customer customer);
}
