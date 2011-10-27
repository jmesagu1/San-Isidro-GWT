package com.sanisidro.entity;

public class ServiceFareUserPK 
{
	private long idServiceType;
	private long idFare;
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