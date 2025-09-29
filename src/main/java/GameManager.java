import characters.Character;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        while (c1.isAlive() && c2.isAlive()) {
            c1.kick(c2);
            c2.kick(c1);
        }
    }
}
