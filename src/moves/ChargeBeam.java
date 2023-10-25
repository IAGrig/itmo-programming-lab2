package moves;

import lab2.Utils;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        if (Utils.checkChance(0.7)) {
            Utils.changeStat(pokemon, Stat.SPECIAL_ATTACK, 1);
        }
    }

    @Override
    protected String describe() {
        return "использует Charge Beam";
    }
}
