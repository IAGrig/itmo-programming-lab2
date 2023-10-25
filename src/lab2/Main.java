package lab2;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Latios latios = new Latios("Morrigan", 5);
        Pansear pansear = new Pansear("Sorin", 3);
        Simisear simisear = new Simisear("Thalia", 3);
        Seedot seedot = new Seedot("Coven", 2);
        Nuzleaf nuzleaf = new Nuzleaf("Aradia", 2);
        Shiftry shiftry = new Shiftry("Faerie", 2);

        Battle battle = new Battle();
        battle.addAlly(latios);
        battle.addAlly(pansear);
        battle.addAlly(simisear);
        battle.addFoe(seedot);
        battle.addFoe(nuzleaf);
        battle.addFoe(shiftry);

        battle.go();
    }
}
