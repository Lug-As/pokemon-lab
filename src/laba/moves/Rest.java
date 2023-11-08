package laba.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 1);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
        Effect effect = (new Effect()).condition(Status.SLEEP).attack(0.0).turns(2);
        pokemon.setCondition(effect);
        pokemon.setMod(Stat.HP, (int) (pokemon.getHP() - pokemon.getStat(Stat.HP)));
    }

    @Override
    protected String describe() {
        return "засыпает на два хода. Это полностью восстанавливает здоровье покемона и устраняет любые статусные состояния";
    }
}
