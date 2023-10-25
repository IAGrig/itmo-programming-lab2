package moves;

import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class HealPulse extends StatusMove {
    public HealPulse() {
        super(Type.PSYCHIC, 0, 0);
        // can't be implemented
    }

    @Override
    protected String describe() {
        return "использует Heal Pulse";
    }
}
