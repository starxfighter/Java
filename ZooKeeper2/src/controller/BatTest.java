package controller;

import classes.Bat;
import classes.Gorilla;

public class BatTest {

	public static void main(String[] args) {
		Gorilla grapeApe = new Gorilla();
		System.out.println("First initialization" + grapeApe);
		grapeApe.throwSomethin();
		grapeApe.throwSomethin();
		grapeApe.throwSomethin();
		grapeApe.eatBananas();
		grapeApe.eatBananas();
		grapeApe.climb();
		grapeApe.displayEnergy();
		Bat dracula = new Bat();
		System.out.println("First Bat initialization" + dracula);
		dracula.attackTown();
		dracula.attackTown();
		dracula.attackTown();
		dracula.eatHumans();
		dracula.eatHumans();
		dracula.fly();
		dracula.fly();
		dracula.displayEnergy();
	}

}
