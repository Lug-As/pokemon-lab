package laba.pokemons;

import laba.moves.PoisonPowder;

public class Weepinbell extends Bellsprout {
    public Weepinbell(String name, int level) {
        super(name, level);
        this.setStats(65, 90, 50, 85, 45, 55);
        this.addMove(new PoisonPowder());
    }

    public Weepinbell() {
        this("Безымянный Випинбелл", 1);
    }
}
