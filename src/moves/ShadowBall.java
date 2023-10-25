package moves;

import lab2.Utils;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;


public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Utils.checkChance(0.2)) {
            Utils.changeStat(pokemon, Stat.SPECIAL_DEFENSE, -1);
        }
    }

    protected String describe() {
        return "использует Shadow Ball";
    }
}
