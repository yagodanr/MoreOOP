package characters;
import java.util.Random;

import kickStrategy.RandomKick;

public class Knight extends Character {
    static Random rand = new Random();

    public Knight() {
        super(2+rand.nextInt(10), 2+rand.nextInt(10), new RandomKick());
    }
}
