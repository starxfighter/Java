package classes;

public class Ninja extends Human{
	
	public Ninja() {
		this.stealth = 10;
	};
	
	public void steal(Human person) {
		person.health = person.health - this.stealth;
		this.health = this.health + this.stealth;
		System.out.println("Sneaky!!!");
	}
	
	public void runAway() {
		this.health = this.health - 10;
		System.out.println("Feel the wind");
	}
	
	@Override
    public String toString(){
        return "Ninja{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
    }

}