package ua.taraslviv.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import ua.taraslviv.dao.ElementDao;

public class ElementDaoImpl<E> implements ElementDao<E> {

	private Class<E> elementClass;

	@PersistenceContext(name = "internet-shop")
	EntityManager entityManager;

	public ElementDaoImpl(Class<E> elementClass) {
		this.elementClass = elementClass;
	}

	@Transactional
	public void createElemnt(E element) {
		entityManager.persist(element);
		entityManager.flush();
	}

	@Transactional
	public void updateElement(E element) {
		entityManager.merge(element);
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public E getElement(Long elementId) {
		try {
			return (E) entityManager
					.createQuery("select e from " + elementClass.getSimpleName() + " e where e.id = :id")
					.setParameter("id", elementId).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Transactional
	public List<E> getAllElements() {
		return (List<E>) entityManager.createQuery("from " + elementClass.getSimpleName()).getResultList();
	}

	@Transactional
	public void deleteElement(E element) {
		entityManager.remove(entityManager.merge(element));
	}
}
