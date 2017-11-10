package by.htp.les6hm.largeElectricalAppliances.forKitchen;

import by.htp.les6hm.electricalAppliances.homeAppliances.HomeAppliances;

public final class Dishwasher extends AppliancesForKitchen {

	private String color;
	private String format;
	private int heightEmbedding;
	private int widthEmbedding;
	private int deepEmbedding;
	private int maxLoad;
	
	//Getters and setters
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public int getHeightEmbedding() {
		return heightEmbedding;
	}
	public void setHeightEmbedding(int heightEmbedding) {
		this.heightEmbedding = heightEmbedding;
	}
	public int getWidthEmbedding() {
		return widthEmbedding;
	}
	public void setWidthEmbedding(int widthEmbedding) {
		this.widthEmbedding = widthEmbedding;
	}
	public int getDeepEmbedding() {
		return deepEmbedding;
	}
	public void setDeepEmbedding(int deepEmbedding) {
		this.deepEmbedding = deepEmbedding;
	}
	public int getMaxLoad() {
		return maxLoad;
	}
	public void setMaxLoad(int maxLoad) {
		this.maxLoad = maxLoad;
	}
	
	//methods
	
	public void turnOnTheDevice(HomeAppliances homeAppliances) {
		
		if(homeAppliances instanceof Dishwasher) {
			plugInAppliance = "The dishwasher was plugged into a rosette";
			System.out.println(plugInAppliance);
		} else if(homeAppliances != null) {
			plugInAppliance = "You plugged another appliance";
			System.out.println(plugInAppliance);
		} 
	
	}
	
}
