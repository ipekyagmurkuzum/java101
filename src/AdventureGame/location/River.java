package AdventureGame.location;

import AdventureGame.monsters.Bear;
import AdventureGame.monsters.Monster;

public class River extends BattleLocation{

    River(Monster monster) {
        super(new Bear());
    }

    @Override
    public boolean onLocation(int locationID) {
        return locationID == 5;
    }

    @Override
    public void combat() {
    }

}
