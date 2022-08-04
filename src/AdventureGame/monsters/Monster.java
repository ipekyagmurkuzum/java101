package AdventureGame.monsters;

public class Monster {
    private String monsterName;
    private int health;
    private int damage;
    private int money;


    public Monster() {}

    public void setMonster(int locationID) {
        switch (locationID) {
            case 3 -> {
                //cave
                this.monsterName = "Zombie";
                this.health = 10;
                this.damage = 3;
                this.money = 4;
            }
            case 4 -> {
                //forest
                this.monsterName = "Vampire";
                this.health = 14;
                this.damage = 4;
                this.money = 7;
            }
            case 5 -> {
                //river
                this.monsterName = "Bear";
                this.health = 20;
                this.damage = 7;
                this.money = 12;
            }
            default -> System.out.println("No such location ID!");
        }
    }
}
