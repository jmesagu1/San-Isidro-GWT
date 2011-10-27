package com.sanisidro.manager;

import com.sanisidro.service.DataService;
import com.sanisidro.to.ZoneTO;

public class ZoneManager {
	
	public static final String DATA_SERVICE = "com.sanisidro.service.ZoneService";
	
	public ZoneTO createZone(ZoneTO zone)
	{
		try 
		{
			return (ZoneTO) new DataService().create(DATA_SERVICE, zone);
		}
		catch (Exception e) {
			e.printStackTrace();
			zone.setId(-1);
			return zone;
		}
	}
	
	public boolean updateZone(ZoneTO zone) {
		return new DataService().update(DATA_SERVICE, zone);
	}
}