package edu.es.eoi.dao;

import edu.es.eoi.entity.Pokemon;

public interface PokemonDAO {
	
	public Pokemon findByPockedexNumber(int number);	
		
}
