package laba.pokemons;

import laba.moves.Rest;

public class Victreebel extends Weepinbell {
    public Victreebel(String name, int level) {
        super(name, level);
        this.setStats(80, 105, 65, 100, 70, 70);
        this.addMove(new Rest());
    }

    public Victreebel() {
        this("Безымянный Виктрибелл", 1);
    }
}
