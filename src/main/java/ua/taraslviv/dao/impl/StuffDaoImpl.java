package ua.taraslviv.dao.impl;

import org.springframework.stereotype.Repository;

import ua.taraslviv.dao.StuffDao;
import ua.taraslviv.model.Stuff;

@Repository
public class StuffDaoImpl extends ElementDaoImpl<Stuff> implements StuffDao{

	public StuffDaoImpl() {
		super(Stuff.class);
	}
	
}
