package AdventureGame.location;

import AdventureGame.monsters.Monster;

import java.lang.management.MonitorInfo;

public abstract class NormalLocation extends Location{

    @Override
    public boolean onLocation(int locationID) {
        return false;
    }
}
