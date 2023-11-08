package laba;

import laba.pokemons.Relicanth;
import laba.pokemons.Victreebel;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello pokemons!");

        Battle battle = new Battle();
        Pokemon p1 = new Relicanth("Чужой", 1);
        Pokemon p2 = new Victreebel("Хищник", 1);
        battle.addAlly(p1);
        battle.addFoe(p2);
        battle.go();
    }
}