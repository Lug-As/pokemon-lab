package moves;

import ru.ifmo.se.pokemon.*;

public class RazorLeaf extends PhysicalMove {
    public RazorLeaf() {
        super(Type.GRASS, 55, 0.95);
    }

    @Override
    protected double calcCriticalHit(Pokemon attackingPokemon, Pokemon defendingPokemon) {
        attackingPokemon.addEffect(new Effect().stat(Stat.SPEED, 1));
        return super.calcCriticalHit(attackingPokemon, defendingPokemon);
    }

    @Override
    protected String describe() {
        return "выпускает листья с острыми краями, чтобы поразить противника";
    }
}
