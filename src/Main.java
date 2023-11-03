import pokemons.Victreebel;
import pokemons.Weepinbell;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello pokemon!");

        Battle battle = new Battle();
        Pokemon p1 = new Victreebel();
        Pokemon p2 = new Weepinbell("Селеменчук", 1);
        battle.addAlly(p1);
        battle.addFoe(p2);
        battle.go();
    }
}