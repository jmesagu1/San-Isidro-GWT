package com.sanisidro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: ServiceFareUser
 *
 */
@Entity
@Table(name="service_fare_user")
@IdClass(ServiceFareUserPK.class)
public class ServiceFareUser
{
	@Column(name="id_service_type")
	@Id
	private long idServiceType;
	@Column(name="id_fare")
	@Id
	private long idFare;
	@Column(name="id_user_type")
	@Id
	private long idUserType;
	
	public long getIdServiceType() {
		return idServiceType;
	}
	public void setIdServiceType(long idServiceType) {
		this.idServiceType = idServiceType;
	}
	public long getIdFare() {
		return idFare;
	}
	public void setIdFare(long idFare) {
		this.idFare = idFare;
	}
	public long getIdUserType() {
		return idUserType;
	}
	public void setIdUserType(long idUserType) {
		this.idUserType = idUserType;
	}
}
