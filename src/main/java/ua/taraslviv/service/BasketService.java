package ua.taraslviv.service;

import java.util.List;

import ua.taraslviv.model.Basket;

public interface BasketService {

	void createBasket(Basket basket);
	
	Basket getBasketById(Long id);
	
	List<Basket> getAllBaskets();
	
	void updateBasket(Basket basket);
	
	void deleteBasket(Basket basket);
}
