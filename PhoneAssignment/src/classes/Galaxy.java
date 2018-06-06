package classes;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String temp = this.getRingTone();
    	return temp;
    }
    @Override
    public String unlock() {
    	String temp = "unlocking via finger print";
    	return temp;
    }
    @Override
    public void displayInfo() {
    	String tempVer = this.getVersionNumber();
    	int tempBat = this.getBatteryPercentage();
    	String tempCar = this.getCarrier();
    	System.out.println("This is a IPhone " + tempVer + " that has a battery % of " + tempBat + " that is running on the " + tempCar + "network");             
    }
}
