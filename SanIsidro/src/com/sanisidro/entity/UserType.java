package com.sanisidro.entity;

import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UserType
 *
 */
@Entity
@Table(name="User_Type")
public class UserType
{	   
	@Id
	private long id;
	@Column(name="TypeName")
	private String name;

	public UserType() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
}