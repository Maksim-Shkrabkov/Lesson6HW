package by.htp.les6hm.smallElectricalAppliances.forKitchen;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public final class Toaster extends AppliancesForKitchen {
	
	private String color;
	private int height;
	private int width;
	private int deep;
	private int weight;
	private int quantityOfToasters;
	
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
	public int getDeep() {
		return deep;
	}
	public void setDeep(int deep) {
		this.deep = deep;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getQuantityOfToasters() {
		return quantityOfToasters;
	}
	public void setQuantityOfToasters(int quantityOfToasters) {
		this.quantityOfToasters = quantityOfToasters;
	}
	
	//methods
	
	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof Toaster) {
			plugInAppliance = "The Toaster was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		} 
	
	}
	
}
