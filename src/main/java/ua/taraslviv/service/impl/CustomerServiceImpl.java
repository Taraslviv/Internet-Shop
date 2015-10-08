package ua.taraslviv.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.taraslviv.dao.CustomerDao;
import ua.taraslviv.model.Customer;
import ua.taraslviv.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Inject
	private CustomerDao customerDao;
	
	@Transactional
	public void createCustomer(Customer customer) {
		customerDao.createElemnt(customer);
	}

	@Transactional
	public Customer getCustomerById(Long id) {
		return customerDao.getElement(id);
	}

	@Transactional
	public Customer getCustomerByEmail(String email) {
		return customerDao.findByEmail(email);
	}

	@Transactional
	public List<Customer> getAllCustomers() {
		return customerDao.getAllElements();
	}

	@Transactional
	public void updateCustomer(Customer customer) {
		customerDao.updateElement(customer);
	}

	@Transactional
	public void deleteCustomer(Customer customer) {
		customerDao.deleteElement(customer);
	}

}
