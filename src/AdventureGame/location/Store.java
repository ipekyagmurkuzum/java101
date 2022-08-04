package AdventureGame.location;

import AdventureGame.monsters.Monster;

public class Store extends NormalLocation{

    @Override
    public boolean onLocation(int locationID) {
        return locationID == 2;
    }
}
