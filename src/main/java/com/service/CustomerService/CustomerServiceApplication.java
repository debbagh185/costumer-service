package com.service.CustomerService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.service.CustomerService.entities.Customer;
import com.service.CustomerService.dao.CustomerRepository;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	
    @Bean
	CommandLineRunner startCommandLineRunner(CustomerRepository customerRepository, RepositoryRestConfiguration repositoryRestConfiguration) {
		repositoryRestConfiguration.exposeIdsFor(Customer.class);
		return args ->{
			customerRepository.save(new Customer(null,"DEBBAGH", "debbagh185@gmail.com"));
			customerRepository.save(new Customer(null,"BRAHIM", "brahim@gmail.com"));
			customerRepository.save(new Customer(null,"KHALID", "khalid@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.getName()+" -> "+c.getEmail());
			});
		}; 
	}

}
