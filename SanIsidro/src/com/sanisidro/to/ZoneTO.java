package com.sanisidro.to;

import java.io.Serializable;

public class ZoneTO implements Serializable{

	private long id;
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