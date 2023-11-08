package laba.moves;

import ru.ifmo.se.pokemon.*;

public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 0.7);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ELECTRIC)) {
            Effect e = (new Effect()).condition(Status.PARALYZE).chance(0.3).attack(0.75).turns(-1);
            e.stat(Stat.SPEED, -2);
            pokemon.setCondition(e);
        }
    }

    @Override
    protected String describe() {
        return "наносит жестокую молниеносную атаку, которая может парализовать противника";
    }
}
