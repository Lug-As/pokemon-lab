package laba.pokemons;

import laba.moves.Blizzard;
import laba.moves.Harden;
import laba.moves.HydroPump;
import laba.moves.TakeDown;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Relicanth extends Pokemon {
    public Relicanth(String name, int level) {
        super(name, level);
        this.setType(Type.WATER, Type.ROCK);
        this.setStats(100, 90, 130, 45, 65, 55);
        this.addMove(new TakeDown());
        this.addMove(new Blizzard());
        this.addMove(new Harden());
        this.addMove(new HydroPump());
    }

    public Relicanth() {
        this("Безымянный Реликант", 1);
    }
}
