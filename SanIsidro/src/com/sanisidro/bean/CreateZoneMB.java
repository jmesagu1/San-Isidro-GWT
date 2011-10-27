package com.sanisidro.bean;

import com.sanisidro.to.ZoneTO;
import com.sanisidro.wrapper.SanIsidroWrapper;

public class CreateZoneMB {

	private String zoneName;
	private String message;

	public String getZoneName() {
		return zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String createZone()
	{
		ZoneTO zone = new ZoneTO();
		zone.setName(zoneName);
		SanIsidroWrapper wrapper = new SanIsidroWrapper();
		zone = wrapper.createZone(zone);
		if (zone.getId() != -1)
		{
			message = "Zona registrada exitosamente";
			return "success";
		}
		else
		{
			message = "Error registrando zona";
			return "failure";
		}
	}
}