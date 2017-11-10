package by.htp.les6hm.largeElectricalAppliances.forHouse;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public final class Ñonditioner extends AppliancesForHouse {
	
	private int height;
	private int width;
	private int weight;
	private int deep;
	private int noiseLevel;
	
	//Getters and setters
	
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
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getDeep() {
		return deep;
	}
	public void setDeep(int deep) {
		this.deep = deep;
	}
	public int getNoiseLevel() {
		return noiseLevel;
	}
	public void setNoiseLevel(int noiseLevel) {
		this.noiseLevel = noiseLevel;
	}
	
	//methods
	
	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof Ñonditioner) {
			plugInAppliance = "The conditioner was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		} else {
			plugInAppliance = "The conditioner was not plugged into a rosette";
			System.out.println(plugInAppliance);
		}
	
	}

}
