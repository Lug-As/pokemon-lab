package pokemons;

import moves.IcyWind;
import moves.Psybeam;
import moves.Thunder;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class MimeJr extends Pokemon {
    public MimeJr(String name, int level) {
        super(name, level);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setStats(20, 25, 45, 70, 90, 60);
        this.addMove(new Thunder());
        this.addMove(new IcyWind());
        this.addMove(new Psybeam());
    }

    public MimeJr() {
        this("Безымянный Майм Младший", 1);
    }
}
