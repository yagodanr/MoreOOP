package characters;
import java.util.Random;

import kickStrategy.RandomKick;

public class King extends Character {
    static Random rand = new Random();

    public King() {
        super(5+rand.nextInt(10), 5+rand.nextInt(10), new RandomKick());
    }
}
