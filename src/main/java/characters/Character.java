package characters;
import kickStrategy.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public abstract class Character {
    @Getter @Setter
    private int power;
    @Getter
    private int hp;
    private KickStrategy kickStrategy;

    public void kick(Character c) {
        kickStrategy.kick(this, c);
    }
    public boolean isAlive() {
        return hp > 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }

    public void setHp(int health) {
        hp = Integer.max(health, 0);
    }

}
