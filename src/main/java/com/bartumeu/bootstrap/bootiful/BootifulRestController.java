package com.bartumeu.bootstrap.bootiful;

import com.bartumeu.bootstrap.Customer;
import com.bartumeu.bootstrap.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class BootifulRestController {

	private final CustomerService customerService;

	public BootifulRestController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@GetMapping("/customers")
	Collection<Customer> get() {
		return this.customerService.findAll();
	}
}
