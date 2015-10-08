package ua.taraslviv.dao.impl;

import org.springframework.stereotype.Repository;

import ua.taraslviv.dao.StuffGroupDao;
import ua.taraslviv.model.StuffGroup;

@Repository
public class StuffGroupDaoImpl extends ElementDaoImpl<StuffGroup> implements StuffGroupDao{

	public StuffGroupDaoImpl() {
		super(StuffGroup.class);
	}

	public StuffGroup findByName(String name) {
		return (StuffGroup) entityManager.createQuery("select e from StuffGroup e where e.name = :name")
				.setParameter("name", name).getSingleResult();
	}

}
