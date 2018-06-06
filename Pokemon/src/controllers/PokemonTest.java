package controllers;

import classes.Pokedex;
import classes.Pokemon;

public class PokemonTest {

	public static void main(String[] args) {
		Pokemon tempA;
		Pokemon tempB;
		String result = "";
		
		Pokedex pokieA = new Pokedex();
		tempA = pokieA.createPokemon("Pigpen", 100, "Mudslinger");
		tempB = pokieA.createPokemon("Waterboy", 300, "Liquid Matter");
		
		pokieA.attackPokemon(tempA);
		pokieA.attackPokemon(tempA);
		pokieA.attackPokemon(tempB);
		pokieA.attackPokemon(tempB);
		pokieA.attackPokemon(tempB);
		pokieA.attackPokemon(tempB);
		
		result = pokieA.pokemonInfo(tempA);
		System.out.println(result);
		result = pokieA.pokemonInfo(tempB);
		System.out.println(result);
		
		System.out.println("From the class" + tempA);
		System.out.println("From the class" + tempB);
		
		tempA.displayAll();	
		
	}

}
