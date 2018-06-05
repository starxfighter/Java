package classes;

public class Wizard extends Human{
	
	public Wizard() {};
	
	@Override
    public String toString(){
        return "Wizard{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
    }

}
