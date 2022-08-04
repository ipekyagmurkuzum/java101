package AdventureGame.location;

import AdventureGame.monsters.Monster;
import AdventureGame.monsters.Vampire;

public class Forest extends BattleLocation{

    Forest(Monster monster) {
        super(new Vampire());
    }

    @Override
    public boolean onLocation(int locationID) {
        return locationID == 4;
    }

    @Override
    public void combat() {
    }

}
