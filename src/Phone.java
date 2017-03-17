
public class Phone {
	
	private String Manufacturer;
	private String operating_System;
	private String model;
	private int cost;
	
	public String getManufacturer() {
		return this.Manufacturer;
	}
	
	
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	
	
	public String getOperating_System() {
		return this.operating_System;
	}
	
	
	public void setOperating_System(String operating_System) {
		this.operating_System = operating_System;
	}
	
	
	public String getModel() {
		return this.model;
	}
	
	
	public void setModel(String model) {
		this.model = model;
	}
	
	
	public int getCost() {
		return this.cost;
	}
	
	
	public void setCost(int cost) {
		this.cost = cost;
	}


	public Phone(String manufacturer, String operating_System, String model, int cost) {
		
		Manufacturer = manufacturer;
		this.operating_System = operating_System;
		this.model = model;
		this.cost = cost;
	}
	
	
	public void PhoneDetails(){
		System.out.println("Manufacture Name:"+getManufacturer()+" "+"\n" +"Operating System:"+getOperating_System()+" " +"\n"+"Model:"+getModel()+" "+"\n"+"Cost:"+getCost() );
		
		System.out.println("************************************");
	}
	
	

}
