package AdventureGame.location;

import AdventureGame.monsters.Monster;
import AdventureGame.monsters.Zombie;

public class Cave extends BattleLocation {

    Cave(Monster monster) {
        super(new Zombie());
    }

    @Override
    public boolean onLocation(int locationID) {
        return locationID == 3;
    }

    @Override
    public void combat() {
    }

}
