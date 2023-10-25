package pokemons;

import moves.Pound;
import moves.ShadowBall;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nuzleaf extends Pokemon {
    public Nuzleaf(String name, int level) {
        super(name, level);
        super.setStats(70, 70, 40, 60, 40, 60);
        super.setType(Type.GRASS, Type.DARK);
        ShadowBall shadowBall = new ShadowBall();
        Swagger swagger = new Swagger();
        Pound pound = new Pound();
        super.addMove(shadowBall);
        super.addMove(swagger);
        super.addMove(pound);
    }
}
