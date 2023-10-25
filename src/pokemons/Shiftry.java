package pokemons;

import moves.Pound;
import moves.RazorLeaf;
import moves.ShadowBall;
import moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shiftry extends Pokemon {
    public Shiftry(String name, int level) {
        super(name, level);
        super.setStats(90, 100, 60, 90, 60, 80);
        super.setType(Type.GRASS, Type.DARK);
        ShadowBall shadowBall = new ShadowBall();
        Swagger swagger = new Swagger();
        Pound pound = new Pound();
        RazorLeaf razorLeaf = new RazorLeaf();
        super.addMove(shadowBall);
        super.addMove(swagger);
        super.addMove(pound);
        super.addMove(razorLeaf);
    }
}
