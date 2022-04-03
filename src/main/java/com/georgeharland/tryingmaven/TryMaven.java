package com.georgeharland.tryingmaven;

import eu.iamgio.pokedex.pokemon.Pokemon;
import eu.iamgio.pokedex.pokemon.PokemonType;
import eu.iamgio.pokedex.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class TryMaven {
    public static void main(String[] args) {
        Pokemon bulbasaur = Pokemon.fromName("bulbasaur");
        Pokemon squirtle = Pokemon.fromName("squirtle");
        Pokemon charmander = Pokemon.fromName("charmander");
        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(bulbasaur);
        pokemonList.add(squirtle);
        pokemonList.add(charmander);
    }
}
