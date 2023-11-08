package laba;

import laba.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Да начнётся битва!");

        Battle battle = new Battle();
        Pokemon p1 = new Bellsprout("Чужой", 1);
        Pokemon p2 = new MimeJr("Хищник", 1);
        Pokemon p3 = new MrMime("Монстр", 1);
        Pokemon p4 = new Relicanth("Убийца", 1);
        Pokemon p5 = new Victreebel("Разрушитель", 1);
        Pokemon p6 = new Weepinbell("Каратель", 1);
        battle.addAlly(p1);
        battle.addAlly(p3);
        battle.addAlly(p5);
        battle.addFoe(p2);
        battle.addFoe(p4);
        battle.addFoe(p6);
        battle.go();
    }
}