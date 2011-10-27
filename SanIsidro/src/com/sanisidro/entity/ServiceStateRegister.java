package com.sanisidro.entity;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ServiceStateRegister
 *
 */
@Entity
@Table(name="Service_State_Register")

public class ServiceStateRegister implements Serializable {

	   
	@Id
	private long id;
	private Service service;
	private double price;
	@Temporal(TemporalType.DATE)
	private Calendar changeDate;
	private static final long serialVersionUID = 1L;

	public ServiceStateRegister() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public Service getService() {
		return this.service;
	}

	public void setService(Service service) {
		this.service = service;
	}   
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}   
	public Calendar getChangeDate() {
		return this.changeDate;
	}

	public void setChangeDate(Calendar changeDate) {
		this.changeDate = changeDate;
	}
   
}
