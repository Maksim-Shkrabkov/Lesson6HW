package by.htp.les6hm.largeElectricalAppliances.forHouse;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public final class TV extends AppliancesForHouse {
	
	private int diagonal;
	private int height;
	private int width;
	private int weight;
	private int deep;
	private String smartTV;
	
	
	//Getters and setters
	
	public int getDiagonal() {
		return diagonal;
	}
	public void setDiagonal(int diagonal) {
		this.diagonal = diagonal;
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
	public String getSmartTV() {
		return smartTV;
	}
	public void setSmartTV(String smartTV) {
		this.smartTV = smartTV;
	}
	
	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof TV) {
			plugInAppliance = "The TV was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		} 
	
	}
	

}
