package by.htp.les6hm.largeElectricalAppliances.forKitchen;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public final class Fridge extends AppliancesForKitchen {
	
	private String color;
	private int height;
	private int width;
	private int usefulVolume;
	private String noFrost;
	private int numberOfShelves;
	
	//Getters and setters
	
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
	public int getUsefulVolume() {
		return usefulVolume;
	}
	public void setUsefulVolume(int usefulVolume) {
		this.usefulVolume = usefulVolume;
	}
	public String getNoFrost() {
		return noFrost;
	}
	public void setNoFrost(String noFrost) {
		this.noFrost = noFrost;
	}
	public int getNumberOfShelves() {
		return numberOfShelves;
	}
	public void setNumberOfShelves(int numberOfShelves) {
		this.numberOfShelves = numberOfShelves;
	}
	
	//methods
	
	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof Fridge) {
			plugInAppliance = "The fridge was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		} 
	
	}
	
}
