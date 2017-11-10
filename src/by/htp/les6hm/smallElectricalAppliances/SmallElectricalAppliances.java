package by.htp.les6hm.smallElectricalAppliances;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public abstract class SmallElectricalAppliances extends HomeAppliances{
	
	private String size = "Small";
	private SmallElectricalAppliances[] smallElectricalAppliances;
	
	//Getters and setters
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public SmallElectricalAppliances[] getSmallElectricalAppliances() {
		return smallElectricalAppliances;
	}
	public void setSmallElectricalAppliances(SmallElectricalAppliances[] smallElectricalAppliances) {
		this.smallElectricalAppliances = smallElectricalAppliances;
	}
	
	
	
	

}
