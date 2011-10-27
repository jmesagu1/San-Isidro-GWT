package com.sanisidro.service;

import javax.persistence.EntityManager;

import com.sanisidro.entity.Zone;
import com.sanisidro.to.ZoneTO;

public class ZoneService implements IService{

	@Override
	public Object create(Object obj, EntityManager em) {
		ZoneTO zoneTO = (ZoneTO) obj;
		em.getTransaction().begin();
		Zone zone = new Zone();
		zone.setName(zoneTO.getName());
		em.persist(zone);
		zoneTO.setId(zone.getId());
		em.getTransaction().commit();
		return zoneTO;
	}

	@Override
	public void update(Object obj, EntityManager em) {
		ZoneTO zoneTO = (ZoneTO) obj;
		em.getTransaction().begin();
		Zone zone = em.find(Zone.class, zoneTO.getId());
		if (zone != null) {
			zone.setName(zoneTO.getName());
		}
		zone.setName(zoneTO.getName());
		em.getTransaction().commit();
	}

	@Override
	public Object getDetails(Object obj, EntityManager em) {
		ZoneTO zoneTO = (ZoneTO) obj;
		em.getTransaction().begin();
		Zone zone = em.find(Zone.class, zoneTO.getId());
		if (zone != null) {
			return zone;
		} else {
			return null;
		}
	}
}