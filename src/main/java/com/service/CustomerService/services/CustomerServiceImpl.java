package com.service.CustomerService.services;

import com.service.CustomerService.dao.CustomerRepository;
import com.service.CustomerService.dto.CustomerRequestDTO;
import com.service.CustomerService.dto.CustomerResponseDTO;
import com.service.CustomerService.entities.Customer;
import com.service.CustomerService.mappers.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {

    @Autowired private CustomerRepository customerRepository;
    @Autowired private CustomerMapper customerMapper;

    @Override
    public CustomerResponseDTO save(CustomerRequestDTO customerRequestDTO) {
        Customer customer = customerMapper.fromCustomerRequestDTO(customerRequestDTO);
        Customer saveCustomer = customerRepository.save(customer);
        return customerMapper.fromCustomer(saveCustomer);
    }

    @Override
    public CustomerResponseDTO get(String customerId) {
        return null;
    }

    @Override
    public List<CustomerResponseDTO> findAll() {
        return customerRepository.findAll().stream().map((customer -> customerMapper.fromCustomer(customer))).collect(Collectors.toList());
    }
}
