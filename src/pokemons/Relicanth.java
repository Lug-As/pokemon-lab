package pokemons;

import attacks.Blizzard;
import attacks.Harden;
import attacks.HydroPump;
import attacks.TakeDown;
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
