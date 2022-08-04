package AdventureGame.location;


public class SafeHouse extends NormalLocation{

    public void goToSafeHouse() {
        player.setHealth(player.getInitialHealth());
    }

    @Override
    public boolean onLocation(int locationID) {
        return locationID == 1;
    }
}
