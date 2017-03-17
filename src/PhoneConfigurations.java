
public class PhoneConfigurations extends Phone {
	
	private String display;
	private String ram;
	private String camerapixels;
	private String battery;
	
	
	
	public String getDisplay() {
		return this.display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getRam() {
		return this.ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getCamerapixels() {
		return this.camerapixels;
	}
	public void setCamerapixels(String camerapixels) {
		this.camerapixels = camerapixels;
	}
	public String getBattery() {
		return this.battery;
	}
	public void setBattery(String battery) {
		this.battery = battery;
	}
	
	
	
	
	
	public PhoneConfigurations(String manufacturer, String operating_System, String model, int cost, String display,
			String ram, String camerapixels, String battery) {
		super(manufacturer, operating_System, model, cost);
		this.display = display;
		this.ram = ram;
		this.camerapixels = camerapixels;
		this.battery = battery;

	}
	public void PhoneDetails(){
		super.PhoneDetails();
		
		System.out.println("Manufacture Name:"+getManufacturer()+" "+"\n" +"Operating System:"+getOperating_System()+" " +"\n"+"Model:"+getModel()+" "+"\n"+"Cost:"+getCost()+"\n"+"Display  "+getDisplay() + "\n"+"RAM: "+getRam() +"\n"+"CAMERA:"+getCamerapixels() +"\n"+"Battery"+getBattery());
		System.out.println("************************************");
	}
	

}
