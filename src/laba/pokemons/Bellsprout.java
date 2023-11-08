package laba.pokemons;

import laba.moves.RazorLeaf;
import laba.moves.SleepPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(50, 75, 35, 70, 30, 40);
        this.addMove(new RazorLeaf());
        this.addMove(new SleepPowder());
    }

    public Bellsprout() {
        this("Безымянный Беллспраут", 1);
    }
}
