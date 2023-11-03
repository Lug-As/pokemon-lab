import pokemons.Relicanth;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello pokemon!");

        Battle battle = new Battle();
        Pokemon p1 = new Relicanth();
        Pokemon p2 = new Pokemon("Селеменчук", 1);
        battle.addAlly(p1);
        battle.addFoe(p2);
        battle.go();
    }
}