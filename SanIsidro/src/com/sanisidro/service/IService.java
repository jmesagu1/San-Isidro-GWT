package com.sanisidro.service;

import javax.persistence.EntityManager;

public interface IService {
	
	public Object create(Object obj, EntityManager em);
	
	public void update(Object obj, EntityManager em);
	
	public Object getDetails(Object obj, EntityManager em);
}
