package moves;

import ru.ifmo.se.pokemon.*;

public class IcyWind extends SpecialMove {
    public IcyWind() {
        super(Type.ICE, 55, 0.95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = (new Effect()).stat(Stat.SPEED, -1).turns(-1);
        pokemon.addEffect(e);
    }

    @Override
    protected String describe() {
        return "атакует порывом холодного воздуха, что также снижает скорость противника";
    }

}
