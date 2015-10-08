package ua.taraslviv.dao;

import ua.taraslviv.model.StuffGroup;

public interface StuffGroupDao extends ElementDao<StuffGroup>{

	StuffGroup findByName(String name);
}
