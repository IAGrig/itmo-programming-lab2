package moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon pokemon, double value) {
        super.applyOppDamage(pokemon, value);
        Status pokemonCondition = pokemon.getCondition();
        if (pokemonCondition == Status.BURN || pokemonCondition == Status.POISON || pokemonCondition == Status.PARALYZE) {
            super.applyOppDamage(pokemon, value);
        }
    }

    @Override
    protected String describe() {
        return "использует Facade";
    }
}
