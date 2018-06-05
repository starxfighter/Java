package classes;

public class Samurai extends Human {
	static int count = 0;
	
	public Samurai() {
		this.health = 200;
		count++;
	};
	
	public void deathBlow(Human person) {
		person.health = 0;
		this.health = this.health / 2;
		System.out.println("See you sucker");
	}
	
	public void meditate() {
		this.health = this.health + (this.health / 2);
		System.out.println("Ahh. The inner peace");
	}
	
	public void howMany() {
		System.out.println("There are " + count + " Samurai's created");
	}
	
	@Override
    public String toString(){
        return "Samurai{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
    }

}