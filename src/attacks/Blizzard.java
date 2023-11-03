package attacks;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard() {
        super(Type.ICE, 110, 0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ICE)) {
            Effect effect = (new Effect()).condition(Status.FREEZE).chance(0.1).attack(0.0).turns(-1);
            pokemon.addEffect(effect);
        }
    }

    @Override
    protected String describe() {
        return "вызывает воющий буран, бьющий противника";
    }
}
