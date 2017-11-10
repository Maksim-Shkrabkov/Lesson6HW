package by.htp.les6hm.largeElectricalAppliances.forKitchen;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public final class ElectricityPlate extends AppliancesForKitchen {
	
	private String color;
	private int numberOfBurners;
	private int ovenVolume;
	private int height;
	private int width;
	private int deep;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNumberOfBurners() {
		return numberOfBurners;
	}


	public void setNumberOfBurners(int numberOfBurners) {
		this.numberOfBurners = numberOfBurners;
	}


	public int getOvenVolume() {
		return ovenVolume;
	}


	public void setOvenVolume(int ovenVolume) {
		this.ovenVolume = ovenVolume;
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


	//methods

	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof ElectricityPlate) {
			plugInAppliance = "The electricity plate was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		}
	
	}

}
