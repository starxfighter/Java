package classes;

public class Bat extends Mammal{
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		energyLevel = energyLevel - 50;
		System.out.println("Swoop!!!!");
	}
	
	public void eatHumans() {
		energyLevel = energyLevel + 25;
		System.out.println("What a tasty snack");
	}
	
	public void attackTown() {
		energyLevel = energyLevel - 100;
		System.out.println("Burn Baby Burn!!!!");
	}
	
	@Override
    public String toString(){
        return "Bat{" + "EnergyLevel= " + energyLevel + "}";
    }

}
