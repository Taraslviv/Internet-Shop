package ua.taraslviv.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.taraslviv.dao.BasketDao;
import ua.taraslviv.model.Basket;
import ua.taraslviv.service.BasketService;

@Service
public class BasketServiceImpl implements BasketService{

	@Inject
	private BasketDao basketDao;
	
	@Transactional
	public void createBasket(Basket basket) {
		basketDao.createElemnt(basket);
	}

	@Transactional
	public Basket getBasketById(Long id) {
		return basketDao.getElement(id);
	}

	@Transactional
	public List<Basket> getAllBaskets() {
		return basketDao.getAllElements();
	}

	@Transactional
	public void updateBasket(Basket basket) {
		basketDao.updateElement(basket);
	}

	@Transactional
	public void deleteBasket(Basket basket) {
		basketDao.deleteElement(basket);
	}

}
