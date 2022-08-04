package AdventureGame.inventory;


public class Inventory {

    private boolean water;
    private boolean food;
    private boolean firewood;
    private String weaponName;
    private String armourName;
    private int weaponDamage;
    private int armourDefence;


    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmourName() {
        return armourName;
    }

    public void setArmourName(String armourName) {
        this.armourName = armourName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmourDefence() {
        return armourDefence;
    }

    public void setArmourDefence(int armourDefence) {
        this.armourDefence = armourDefence;
    }

    Inventory() {
    }


}
