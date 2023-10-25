package pokemons;


import moves.DoubleTeam;
import moves.Facade;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pansear extends Pokemon {
    public Pansear(String name, int level) {
        super(name, level);
        super.setStats(50, 53, 48, 53, 48, 64);
        super.setType(Type.FIRE);
        Facade facade = new Facade();
        DoubleTeam doubleTeam = new DoubleTeam();
        Swagger swagger = new Swagger();
        super.addMove(facade);
        super.addMove(doubleTeam);
        super.addMove(swagger);
    }
}
