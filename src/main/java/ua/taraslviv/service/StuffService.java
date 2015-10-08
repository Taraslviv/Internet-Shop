package ua.taraslviv.service;

import java.util.List;

import ua.taraslviv.model.Stuff;

public interface StuffService {
	
	void createStuff(Stuff stuff);
	
	Stuff getStuffById(Long id);
	
	List<Stuff> getAllStuff();
	
	void updateStuff(Stuff stuff);
	
	void deleteStuff(Stuff stuff);

}
