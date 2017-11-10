package by.htp.les6hm.smallElectricalAppliances.forKitchen;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;


public final class MeatGrinder extends AppliancesForKitchen {
	
	private int weight;
	private String material;
	private String reverse;
	
	//Getters and setters
	
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getReverse() {
		return reverse;
	}
	public void setReverse(String reverse) {
		this.reverse = reverse;
	}
	
	
	//methods
	
	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof MeatGrinder) {
			plugInAppliance = "The MeatGrinder was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		} 
	
	}
	

}
