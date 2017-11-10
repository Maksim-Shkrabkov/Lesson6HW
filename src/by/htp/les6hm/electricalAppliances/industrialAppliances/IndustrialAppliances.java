package by.htp.les6hm.electricalAppliances.industrialAppliances;

import by.htp.les6hm.electricalAppliances.ElectricalAppliances;

public abstract class IndustrialAppliances extends ElectricalAppliances {
	
	private String placeOfUse = "Industrial";
	private int power;
	private IndustrialAppliances[] industrialAppliances;
	
	//Getters and setters
	
	public String getPlaceOfUse() {
		return placeOfUse;
	}
	public void setPlaceOfUse(String placeOfUse) {
		this.placeOfUse = placeOfUse;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public IndustrialAppliances[] getIndustrialAppliances() {
		return industrialAppliances;
	}
	public void setIndustrialAppliances(IndustrialAppliances[] industrialAppliances) {
		this.industrialAppliances = industrialAppliances;
	}
	
	

}
