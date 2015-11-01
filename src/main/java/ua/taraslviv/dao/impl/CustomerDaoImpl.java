package ua.taraslviv.dao.impl;

import org.springframework.stereotype.Repository;

import ua.taraslviv.dao.CustomerDao;
import ua.taraslviv.model.Customer;

@Repository
public class CustomerDaoImpl extends ElementDaoImpl<Customer> implements CustomerDao {

	public CustomerDaoImpl() {
		super(Customer.class);
	}

	public Customer findByEmail(String email) {
		return (Customer) entityManager
				.createQuery("select e from Customer e where e.email = :email")
				.setParameter("email", email).getSingleResult();
	}

}