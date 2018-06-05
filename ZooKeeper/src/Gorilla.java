
public class Gorilla extends Mammal {
	public Gorilla() {};
	
	public void throwSomethin() {
		energyLevel = energyLevel - 5;
		System.out.println("The gorilla threw something at you, duck!!!");
	}
	
	public void eatBananas() {
		energyLevel = energyLevel + 10;
		System.out.println("Yummy eat something yellow");
	}
	
	public void climb() {
		energyLevel = energyLevel - 10;
		System.out.println("That was a workout");
	}
	
	@Override
    public String toString(){
        return "Gorilla{" + "EnergyLevel= " + energyLevel + "}";
    }
}
