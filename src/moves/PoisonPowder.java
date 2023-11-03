package moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class PoisonPowder extends StatusMove {
    public PoisonPowder() {
        super(Type.POISON, 0, 0.75);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect.poison(pokemon);
    }


    @Override
    protected String describe() {
        return "рассеивает ядовитую пыль, которая отравляет цель";
    }
}
