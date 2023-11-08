package laba.pokemons;

import laba.moves.MagicalLeaf;

public class MrMime extends MimeJr {
    public MrMime(String name, int level) {
        super(name, level);
        this.setStats(40, 45, 65, 100, 120, 90);
        this.addMove(new MagicalLeaf());
    }

    public MrMime() {
        this("Безымянный Мистер Майм", 1);
    }
}
