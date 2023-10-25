package lab2;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class Utils {
    public static boolean checkChance(double chance) {
        return chance >= Math.random();
    }

    public static void changeStat(Pokemon pokemon, Stat stat, int difference) {
        pokemon.setMod(stat, (int) (pokemon.getStat(stat) + difference));
    }
}
