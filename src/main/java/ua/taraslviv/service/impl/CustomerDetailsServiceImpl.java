package ua.taraslviv.service.impl;

import java.util.ArrayList;
import java.util.Collection;

import javax.inject.Inject;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.taraslviv.dao.CustomerDao;


@Service
public class CustomerDetailsServiceImpl implements UserDetailsService {

	@Inject
	private CustomerDao customerDao;

	@Transactional
	public UserDetails loadUserByUsername(String email) {

		ua.taraslviv.model.Customer customerEntity = customerDao.findByEmail(email);

		if (customerEntity == null)
			throw new UsernameNotFoundException("Error in email, or password");

		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("CUSTOMER_USER"));

		return new User(customerEntity.getEmail(),
				customerEntity.getPassword(), authorities);
	}

}
