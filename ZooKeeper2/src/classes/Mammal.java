package classes;

public class Mammal {
	protected int energyLevel;
	
	public Mammal() {
		this.setEnergyLevel(100);
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergy() {
		System.out.println("The energy level is: " + energyLevel);
		return energyLevel;
	}
	
	@Override
    public String toString(){
        return "Mammal{" + "EnergyLevel= " + energyLevel +"}";
    }
}