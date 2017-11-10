package by.htp.les6hm.electricalAppliances.homeAppliances;

import java.util.Arrays;

import by.htp.les6hm.Method;
import by.htp.les6hm.electricalAppliances.ElectricalAppliances;

public class HomeAppliances extends ElectricalAppliances implements Method {
	
	private String placeOfUse = "Home";
	private int power;
	public String plugInAppliance;
	private HomeAppliances[] homeAppliances;
	private int[] massiveOfPower;

	
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
	
	public int[] getMassiveOfPower() {
		return massiveOfPower;
	}

	public void setMassiveOfPower(int[] massiveOfPower) {
		this.massiveOfPower = massiveOfPower;
	}
	
	//methods
	
	//turn on appliances into a rosset


	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances != null) {
			plugInAppliance = "The device was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else {
			plugInAppliance = "The device was not plugged into a rosette";
			System.out.println(plugInAppliance);
		}
	
	}
	
	//calculate the consumed power 

	public void createMassiveOfAppliance(int quantity) {
		homeAppliances = new HomeAppliances[quantity]; 
	}
	
	public void addAppliance(HomeAppliances homeAppliance, int position) {
		homeAppliances[position] = homeAppliance;
	}
	
	public void countUpPower() {
		
		int power = 0;
		
		for(HomeAppliances homeAppliance: homeAppliances) {
			
			if(homeAppliance != null) {
			power += homeAppliance.getPower();
			}
			
		}	
		
		System.out.println("Total power: " + power);
	}
	
	//sorting based on power
	
	
	public void createMassiveOfPower(int quantity) {
		massiveOfPower = new int[quantity]; 
	}
	
	public void addDiviceInMassiveOfPower(HomeAppliances homeAppliance, int position) {
			
			if(homeAppliance != null) {
				 massiveOfPower[position] = homeAppliance.getPower();
	 
			}	
		} 
		
	public void sortMassiveOfPower ( ) {
		
		for (int power : massiveOfPower) {
			   System.out.print("Power = " + power + " ");
			   }
		
		Arrays.sort(massiveOfPower);
		System.out.println();
		System.out.println("Result of sorting massive: ");
		
		for (int power : massiveOfPower) {
			   System.out.print("Power = " + power + " ");
			   }
		
	}
	
	//find appliance by parameters
	
	public void findAppliance() {
		
		String nameOfCompany = " ";
		
		for(HomeAppliances appliance : homeAppliances) {
			
			if(appliance != null) {
				nameOfCompany = appliance.getCompany();
			}
			
			if(appliance != null && nameOfCompany.equals("LG") && appliance.getPower() >= 100 && appliance.getPower() <= 5000) {
				
				System.out.println();
				System.out.println("name of company: " + appliance.getCompany() + " Name of appliance: " + appliance.getName());
				
			}
			
		}
		
	}

}