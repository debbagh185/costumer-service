package com.service.CustomerService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.service.CustomerService.entities.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
