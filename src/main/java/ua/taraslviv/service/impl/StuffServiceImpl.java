package ua.taraslviv.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.taraslviv.dao.StuffDao;
import ua.taraslviv.model.Stuff;
import ua.taraslviv.service.StuffService;

@Service
public class StuffServiceImpl implements StuffService{

	@Inject
	private StuffDao stuffDao;
	
	@Transactional
	public void createStuff(Stuff stuff) {
		stuffDao.createElemnt(stuff);
	}

	@Transactional
	public Stuff getStuffById(Long id) {
		return stuffDao.getElement(id);
	}

	@Transactional
	public List<Stuff> getAllStuff() {
		return stuffDao.getAllElements();
	}

	@Transactional
	public void updateStuff(Stuff stuff) {
		stuffDao.updateElement(stuff);
	}

	@Transactional
	public void deleteStuff(Stuff stuff) {
		stuffDao.deleteElement(stuff);
	}

}
