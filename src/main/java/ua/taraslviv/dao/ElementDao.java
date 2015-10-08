package ua.taraslviv.dao;

import java.util.List;

public interface ElementDao <E> {

	void createElemnt(E element);
	
	void updateElement(E element);
	
	E getElement(Long elementId);
	
	List<E> getAllElements();
	
	void deleteElement(E element);
}
