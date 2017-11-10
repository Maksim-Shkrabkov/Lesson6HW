package by.htp.les6hm.smallElectricalAppliances.forKitchen;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public final class Mixer extends AppliancesForKitchen {
	
	private int quantityOfNozzles;
	private String color;
	private int height;
	private int width;
	private String material;
	
	//Getters and setters
	
	public int getQuantityOfNozzles() {
		return quantityOfNozzles;
	}
	public void setQuantityOfNozzles(int quantityOfNozzles) {
		this.quantityOfNozzles = quantityOfNozzles;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	//methods
	
	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof Mixer) {
			plugInAppliance = "The Mixer was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		} 
	
	}

}
