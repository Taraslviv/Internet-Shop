package ua.taraslviv.service;

import java.util.List;

import ua.taraslviv.model.StuffGroup;

public interface StuffGroupService {

	void createStuffGroup(StuffGroup stuffGroup);
	
	StuffGroup getStuffGroupById(Long id);
	
	StuffGroup getStuffGroupByName(String name);
	
	List<StuffGroup> getAllStuffGroups();
	
	void updateStuffGroup(StuffGroup stuffGroup);
	
	void deleteStuffGroup(StuffGroup stuffGroup);
	
}
