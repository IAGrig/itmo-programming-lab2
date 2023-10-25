package moves;

import lab2.Utils;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class EnergyBall extends SpecialMove {
    public EnergyBall() {
        super(Type.GRASS, 90, 100);
    }



    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if (Utils.checkChance(0.1)) {
            pokemon.setMod(Stat.SPECIAL_DEFENSE, (int) (pokemon.getStat(Stat.SPECIAL_DEFENSE) - 1));
        }
    }

    @Override
    protected String describe() {
        return "использует Energy Ball";
    }
}
