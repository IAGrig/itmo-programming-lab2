package pokemons;

import moves.DoubleTeam;
import moves.Facade;
import moves.RockSlide;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Simisear extends Pokemon {
    public Simisear(String name, int level) {
        super(name, level);
        super.setStats(75, 98, 63, 98, 63, 101);
        super.setType(Type.FIRE);
        Facade facade = new Facade();
        DoubleTeam doubleTeam = new DoubleTeam();
        Swagger swagger = new Swagger();
        RockSlide rockSlide = new RockSlide();
        super.addMove(facade);
        super.addMove(doubleTeam);
        super.addMove(swagger);
        super.addMove(rockSlide);
    }
}
