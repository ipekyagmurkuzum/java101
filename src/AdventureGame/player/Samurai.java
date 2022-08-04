package AdventureGame.player;

public class Samurai extends Character {
    int initialHealth = 21;

    public Samurai() {
        super(21, 5, 15, "Samurai");
    }

    @Override
    public int getInitialHealth() {
        return initialHealth;
    }

}
