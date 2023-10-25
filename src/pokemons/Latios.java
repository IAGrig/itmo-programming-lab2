package pokemons;

import moves.ChargeBeam;
import moves.DragonClaw;
import moves.EnergyBall;
import moves.HealPulse;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Latios extends Pokemon {
    public Latios(String name, int level) {
        super(name, level);
        super.setStats(80, 90, 80, 130, 110, 110);
        super.setType(Type.DRAGON, Type.PSYCHIC);
        HealPulse healPulse = new HealPulse();
        DragonClaw dragonClaw = new DragonClaw();
        ChargeBeam chargeBeam = new ChargeBeam();
        EnergyBall energyBall = new EnergyBall();
        super.addMove(healPulse);
        super.addMove(dragonClaw);
        super.addMove(chargeBeam);
        super.addMove(energyBall);
    }
}
