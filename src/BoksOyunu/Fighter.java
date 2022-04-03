package BoksOyunu;

public class Fighter {
    String name;
    int health, damage, weight,dodge;

    Fighter(String name, int health, int damage, int weight,int dodge) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.weight = weight;
        this.dodge=dodge;
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " değerinde hasar vurdu.");

        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen hasarı blokladı.");
            return foe.health;
        }
        if (foe.health - this.damage < 0) {
            return 0;
        }
        return foe.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random()*100;
        return randomNumber<=this.dodge;
    }
}
