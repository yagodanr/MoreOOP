package characters;
import kickStrategy.CryKick;

public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3, new CryKick());
    }
}
