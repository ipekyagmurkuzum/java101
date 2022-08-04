package AdventureGame.player;

public class Knight extends Character {
    int initialHealth= 24;
    public Knight() {
        super(24,8,5, "Knight");
    }

    @Override
    public int getInitialHealth() {
        return initialHealth;
    }
}
