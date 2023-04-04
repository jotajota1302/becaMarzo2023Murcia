package edu.es.eoi.service;

import edu.es.eoi.entity.Pokemon;

public interface PokemonService {

	public Pokemon findPokemonByNumber(int pockedex);

	public Pokemon fight(Pokemon pokemon1, Pokemon pokemon2);

}
