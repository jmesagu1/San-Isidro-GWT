package com.sanisidro.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * The persistent class for the zone database table.
 * 
 */
@Entity
public class Zone
{
	@Id	
	private long id;

    @Column(name="zone_Name")
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String zoneName) {
		this.name = zoneName;
	}
}