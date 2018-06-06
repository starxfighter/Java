package classes;

public abstract class AbstractPokemon implements PokemonInterface {


	public Pokemon createPokemon(String name, int health, String type) {
		System.out.println("Created Pokemon");
		String tempname = name;
		String temptype = type;
		int temphealth = health;
		Pokemon pokie = new Pokemon(tempname, temphealth, temptype);
		return pokie;
	}
	
	public void attackPokemon(Pokemon pokieA) {
		System.out.println("Did the attack");
		int temp = 0;
		temp = pokieA.getHealth();
		temp = temp - 10;
		pokieA.setHealth(temp);
	}
	
	public abstract String pokemonInfo(Pokemon pokemon);
	
}
