package classes;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	String temp = this.getRingTone();
    	return temp;
    }
    @Override
    public String unlock() {
    	String temp = "unlocking via facial recognition";
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
