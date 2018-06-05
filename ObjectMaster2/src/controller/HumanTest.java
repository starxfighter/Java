package controller;

import classes.Ninja;
import classes.Samurai;
import classes.Wizard;

public class HumanTest {

	public static void main(String[] args) {
		Wizard merlin = new Wizard();
		Ninja shadow = new Ninja();
		Samurai oozo = new Samurai();
		System.out.println("Before any attacking " + merlin);
		System.out.println("Before any attacking " + shadow);
		System.out.println("Before any attacking " + oozo);
		oozo.attack(merlin);
		oozo.attack(merlin);
		merlin.attack(oozo);
		shadow.attack(oozo);
		shadow.attack(merlin);
		System.out.println("After attacking " + merlin);
		System.out.println("After attacking " + shadow);
		System.out.println("After attacking " + oozo);
		
		merlin.fireball(shadow);
		System.out.println("Current status of Shadow after fireball " + shadow + "\n");
		
		merlin.heal(oozo);
		System.out.println("Current status of Oozo after heal " + oozo + "\n");
		
		oozo.deathBlow(merlin);
		System.out.println("Current status of Merlin after deathblow " + merlin + "\n");
		System.out.println("Current status of Oozo after deathblow " + oozo + "\n");
		
		oozo.meditate();
		System.out.println("Current status of Oozo after meditate " + oozo + "\n");
		
		Samurai boozo = new Samurai();
		System.out.println("Current status of Boozo " + boozo + "\n");
		
		shadow.steal(boozo);
		System.out.println("Current status of Boozo after steal " + boozo + "\n");
		System.out.println("Current status of Shadow after steal " + shadow + "\n");
		
		shadow.steal(oozo);
		System.out.println("Current status of Merlin after steal " + oozo + "\n");
		System.out.println("Current status of Shadow after steal " + shadow + "\n");
		
		shadow.runAway();
		System.out.println("Current status of Merlin after runaway " + shadow + "\n");
		
		oozo.howMany();
		
	}

}
