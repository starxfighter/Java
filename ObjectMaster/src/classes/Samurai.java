package classes;

public class Samurai extends Human {
	
	public Samurai() {};
	
	@Override
    public String toString(){
        return "Samurai{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
    }

}
