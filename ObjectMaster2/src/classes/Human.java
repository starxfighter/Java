package classes;

public class Human {
	protected int strength;
	protected int intelligence;
	protected int stealth;
	protected int health;
	
	public Human() {
		this.health = 100;
		this.stealth = 3;
		this.intelligence = 3;
		this.strength = 3;
	}
	
	public void attack(Human person) {
		this.health = this.health - person.strength;
	}
	
	@Override
    public String toString(){
        return "Human{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
    }
	
}
