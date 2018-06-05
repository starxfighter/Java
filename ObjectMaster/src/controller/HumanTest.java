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
	}

}
