package classes;

public class Ninja extends Human{
	
	public Ninja() {};
	
	@Override
    public String toString(){
        return "Ninja{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
    }

}
