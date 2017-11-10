package by.htp.les6hm.runner;

import java.util.Arrays;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;
import by.htp.les6hm.largeElectricalAppliances.forHouse.Ñonditioner;
import by.htp.les6hm.largeElectricalAppliances.forKitchen.Dishwasher;
import by.htp.les6hm.largeElectricalAppliances.forKitchen.ElectricityPlate;
import by.htp.les6hm.largeElectricalAppliances.forKitchen.Fridge;


public class Main {

	public static void main(String[] args) {

		//turn on appliances into a rosset
		
		ElectricityPlate myPlate = new ElectricityPlate();
		Dishwasher myDishwasher = new Dishwasher();
		Fridge myFridge = new Fridge();
		Ñonditioner myConditioner = new Ñonditioner();
		
		myPlate.turnOnTheDevice(myPlate);
		myDishwasher.turnOnTheDevice(myDishwasher);
		myFridge.turnOnTheDevice(myDishwasher);
		myConditioner.turnOnTheDevice(myDishwasher);
		
		//calculate the consumed power 
				
		myPlate.setPower(3000);
		myDishwasher.setPower(10000);
		
		HomeAppliances myAppliances = new HomeAppliances();
		
		myAppliances.createMassiveOfAppliance(5);

		myAppliances.addAppliance(myDishwasher, 0);
		myAppliances.addAppliance(myPlate, 1);
		
		myAppliances.countUpPower();
		
		
		//sorting based on power
		
		myAppliances.createMassiveOfPower(3);
		
		myAppliances.addDiviceInMassiveOfPower(myDishwasher, 0);
		myAppliances.addDiviceInMassiveOfPower(myPlate, 1);
		
		myAppliances.sortMassiveOfPower();
		
//		find appliance by parameters
		
		myPlate.setCompany("LG");
		myDishwasher.setCompany("Bosh");
		myPlate.setName("The best plate");
		myDishwasher.setName("The best dishwasher ever");
		
//		System.out.println();
//		System.out.print("Mane of company: " + myPlate.getCompany());
		
		myAppliances.findAppliance();
		
		
	}

}
