package pokemons;

import moves.ShadowBall;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Seedot extends Pokemon {
    public Seedot(String name, int level) {
        super(name, level);
        super.setStats(40, 40, 50, 30, 30, 30);
        super.setType(Type.GRASS);
        ShadowBall shadowBall = new ShadowBall();
        Swagger swagger = new Swagger();
        super.addMove(shadowBall);
        super.addMove(swagger);
    }
}
