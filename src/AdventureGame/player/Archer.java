package AdventureGame.player;

public class Archer extends Character {
    int initialHealth = 18;

    public Archer() {
        super(18, 7, 20, "Archer");
    }

    @Override
    public int getInitialHealth() {
        return initialHealth;
    }
}
