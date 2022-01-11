package com.service.CustomerService.services;

import com.service.CustomerService.dto.CustomerRequestDTO;
import com.service.CustomerService.dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {
    CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO);
    CustomerResponseDTO get(String customerId);
    List<CustomerResponseDTO> findAll();
}
