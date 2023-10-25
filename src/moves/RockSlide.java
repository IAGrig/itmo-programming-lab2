package moves;

import lab2.Utils;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }


    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);

        if (Utils.checkChance(0.3)) {
            Effect.flinch(pokemon);
        }
    }

    @Override
    protected String describe() {
        return "использует Rock Slide";
    }
}
