package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;


public class RazorLeaf extends PhysicalMove {
    public RazorLeaf() {
        super(Type.GRASS, 55, 95);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        return 1.0 / 8;
    }

    @Override
    protected String describe() {
        return "использует Razor Leaf";
    }
}
