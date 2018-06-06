package classes;

public class Pokedex extends AbstractPokemon {
	
	public Pokedex() {}

	@Override
	public String pokemonInfo(Pokemon pokemon) {
		System.out.println("In pokedex");
		String tempname = pokemon.getName();
		String temptype = pokemon.getType();
		int temphealth = pokemon.getHealth();
		String result = "";
		result = "The name of the pokemon is " + tempname + " and they are a type of " + temptype + " and currently have a health of " + temphealth;
		
		return result;
	}

}
