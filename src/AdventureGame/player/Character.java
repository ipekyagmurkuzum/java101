package AdventureGame.player;

import AdventureGame.inventory.Inventory;

public abstract class Character {

    private int health;
    private int damage;
    private int money;
    private int characterID;
    private String characterName;
    private Inventory inventory;
    private Character character;
    private static int initialHealth;

    public Character(int characterID) {
        this.characterID = characterID;
    }

    public Character(int health, int damage, int money, String characterName) {
        this.health = health;
        this.damage = damage;
        this.money = money;
        this.characterName = characterName;
    }

    public static void getCharInfo() {
        Character[] characters = {new Samurai(), new Archer(), new Knight()};
        int i = 0;
        for (Character character : characters) {
            System.out.println(++i + "- " + character.getCharacterName() +
                    "\t Health: " + character.getHealth() +
                    "\t Damage: " + character.getDamage() +
                    "\t Money :" + character.getMoney());
        }
    }

    public abstract int getInitialHealth();

    public static Character selectCharacter(int characterID) {

        switch (characterID) {
            case 1:
                return new Samurai();
            case 2:
                return new Archer();
            case 3:
                return new Knight();
            default:
                System.out.println("You have entered wrong character ID! ");
        }
        return null;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

}
