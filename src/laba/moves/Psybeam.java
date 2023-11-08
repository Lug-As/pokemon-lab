package laba.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Psybeam extends SpecialMove {
    public Psybeam() {
        super(Type.PSYCHIC, 65, 1);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (0.1 > Math.random()) {
            Effect.confuse(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "атакует особым лучом. Это также может ввести противника в замешательство";
    }
}
