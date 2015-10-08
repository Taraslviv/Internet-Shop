package ua.taraslviv.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.taraslviv.dao.StuffGroupDao;
import ua.taraslviv.model.StuffGroup;
import ua.taraslviv.service.StuffGroupService;

@Service
public class StuffGroupServiceImpl implements StuffGroupService{

	@Inject
	private StuffGroupDao stuffGroupDao;

	@Transactional
	public void createStuffGroup(StuffGroup stuffGroup) {
		stuffGroupDao.createElemnt(stuffGroup);
	}

	@Transactional
	public StuffGroup getStuffGroupById(Long id) {
		return stuffGroupDao.getElement(id);
	}

	@Transactional
	public StuffGroup getStuffGroupByName(String name) {
		return stuffGroupDao.findByName(name);
	}

	@Transactional
	public List<StuffGroup> getAllStuffGroups() {
		return stuffGroupDao.getAllElements();
	}

	@Transactional
	public void updateStuffGroup(StuffGroup stuffGroup) {
		stuffGroupDao.updateElement(stuffGroup);
	}

	@Transactional
	public void deleteStuffGroup(StuffGroup stuffGroup) {
		stuffGroupDao.deleteElement(stuffGroup);
	}
	
}
