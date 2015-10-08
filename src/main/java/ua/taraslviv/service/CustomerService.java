package ua.taraslviv.service;

import java.util.List;

import ua.taraslviv.model.Customer;

public interface CustomerService {

	void createCustomer(Customer customer);
	
	Customer getCustomerById(Long id);
	
	Customer getCustomerByEmail(String email);
	
	List<Customer> getAllCustomers(); 
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(Customer customer);
}
