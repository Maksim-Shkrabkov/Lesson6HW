package by.htp.les6hm.largeElectricalAppliances;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public abstract class LargeElectricalAppliances extends HomeAppliances {
	
	private String size = "Large";
	private LargeElectricalAppliances[] largeElectricalAppliances;
	
	//Getters and setters
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public LargeElectricalAppliances[] getLargeElectricalAppliances() {
		return largeElectricalAppliances;
	}
	public void setLargeElectricalAppliances(LargeElectricalAppliances[] largeElectricalAppliances) {
		this.largeElectricalAppliances = largeElectricalAppliances;
	}
	
	
	
	
}
