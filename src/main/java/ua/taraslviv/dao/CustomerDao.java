package ua.taraslviv.dao;

import ua.taraslviv.model.Customer;

public interface CustomerDao extends ElementDao<Customer> {

	Customer findByEmail(String email);
}
