
public class TestPhoneConfiguration {

	public static void main(String[] args){
		Phone configuration = new PhoneConfigurations("Samsung", "Android", "Galaxy", 900,"4.7","2GB","5MP","1900mAh");
		configuration.PhoneDetails();
		
		PhoneConfigurations c1=new PhoneConfigurations("Apple", "IOS", "6S", 700,"3.7","4GB","12MP","2900mAh");
		c1.PhoneDetails();
		
		
	}
	
	
}