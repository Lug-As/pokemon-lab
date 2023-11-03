package pokemons;

import attacks.RazorLeaf;
import attacks.SleepPowder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {
    public Bellsprout(String name, int level) {
        super(name, level);
        this.setType(Type.GRASS, Type.POISON);
        this.setStats(50, 75, 35, 79, 30, 40);
        this.addMove(new RazorLeaf());
        this.addMove(new SleepPowder());
    }

    public Bellsprout() {
        this("Безымянный Беллспраут", 1);
    }
}
