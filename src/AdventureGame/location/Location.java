package AdventureGame.location;

import AdventureGame.player.Character;

public abstract class Location {
    Character player;
    String name;

    protected Location() {

    }

    public boolean onLocation(int locationID) {
        return false;
    }
}
