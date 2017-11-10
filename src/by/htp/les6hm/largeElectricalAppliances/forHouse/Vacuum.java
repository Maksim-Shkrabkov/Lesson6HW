package by.htp.les6hm.largeElectricalAppliances.forHouse;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public final class Vacuum extends AppliancesForHouse {
	
	private int height;
	private int width;
	private int weight;
	private int deep;
	private int volumeOfDustContainer;
	
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
	public int getVolumeOfDustContainer() {
		return volumeOfDustContainer;
	}
	public void setVolumeOfDustContainer(int volumeOfDustContainer) {
		this.volumeOfDustContainer = volumeOfDustContainer;
	}
	
	//methods
	
	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof Vacuum) {
			plugInAppliance = "The Vacuum was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		} 
	
	}
	

}
