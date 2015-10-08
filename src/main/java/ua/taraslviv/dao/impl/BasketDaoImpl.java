package ua.taraslviv.dao.impl;

import org.springframework.stereotype.Repository;

import ua.taraslviv.dao.BasketDao;
import ua.taraslviv.model.Basket;

@Repository
public class BasketDaoImpl extends ElementDaoImpl<Basket> implements BasketDao{

	public BasketDaoImpl() {
		super(Basket.class);
	}

}
