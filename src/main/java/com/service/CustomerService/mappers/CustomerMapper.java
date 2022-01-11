package com.service.CustomerService.mappers;

import com.service.CustomerService.dto.CustomerRequestDTO;
import com.service.CustomerService.dto.CustomerResponseDTO;
import com.service.CustomerService.entities.Customer;

public interface CustomerMapper {
    Customer fromCustomerRequestDTO(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO fromCustomer(Customer customer);
}
