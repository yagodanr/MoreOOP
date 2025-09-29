package characters;
import kickStrategy.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
    public boolean isAlive() {
        return hp > 0;
    }

}
