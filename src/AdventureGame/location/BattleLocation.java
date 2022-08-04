package AdventureGame.location;

import AdventureGame.monsters.Monster;

public abstract class BattleLocation extends Location{

    Monster monster;
    BattleLocation(Monster monster) {}
    @Override
    public boolean onLocation(int locationID) {
        return false;
    }

    public void combat() {

    }

}
