package by.htp.les6hm.largeElectricalAppliances.forHouse;

import by.htp.les6hm.largeElectricalAppliances.LargeElectricalAppliances;

public abstract class AppliancesForHouse extends LargeElectricalAppliances {
	
	private String energ��onsumption�lass;
	private AppliancesForHouse[] appliancesForHouse;
	
	//Getters and setters
	
	public String getEnerg��onsumption�lass() {
		return energ��onsumption�lass;
	}
	public void setEnerg��onsumption�lass(String energ��onsumption�lass) {
		this.energ��onsumption�lass = energ��onsumption�lass;
	}
	public AppliancesForHouse[] getAppliancesForHouse() {
		return appliancesForHouse;
	}
	public void setAppliancesForHouse(AppliancesForHouse[] appliancesForHouse) {
		this.appliancesForHouse = appliancesForHouse;
	}
	
	

}
