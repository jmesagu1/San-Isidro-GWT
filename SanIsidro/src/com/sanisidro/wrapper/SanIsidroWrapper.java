package com.sanisidro.wrapper;

import com.sanisidro.manager.ZoneManager;
import com.sanisidro.to.ZoneTO;

public class SanIsidroWrapper {
	
	public ZoneTO createZone(ZoneTO zone) {
		return new ZoneManager().createZone(zone);
	}
	
	public boolean updateZone(ZoneTO zone) {
		return new ZoneManager().updateZone(zone);
	}
}
