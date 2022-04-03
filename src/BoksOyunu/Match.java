package BoksOyunu;

public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight, maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isChecked()) {
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("==========YENİ ROUND===========");
                if (whoGoesFirst()) {
                    this.f2.health = this.f1.hit(f2);
                    if (isWon()) {
                        break;
                    }
                    System.out.println(this.f2.name + " sağlığı " + this.f2.health);
                    this.f1.health = this.f2.hit(f1);
                    if (isWon()) {
                        break;
                    }
                    System.out.println(this.f1.name + " sağlığı " + this.f1.health);
                } else {
                    this.f1.health = this.f2.hit(f1);
                    if (isWon()) {
                        break;
                    }
                    System.out.println(this.f1.name + " sağlığı " + this.f1.health);
                    this.f2.health = this.f1.hit(f2);
                    if (isWon()) {
                        break;
                    }
                    System.out.println(this.f2.name + " sağlığı " + this.f2.health);
                }
            }
        } else {
            System.out.println("Sporcuların sikleti uymuyor.");
        }
    }


    boolean isChecked() {
        return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) &&
                (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
    }

    boolean isWon() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " maçı kazandı !");
            return true;
        } else if (this.f2.health == 0) {
            System.out.println(this.f1.name + " maçı kazandı !");
            return true;
        }
        return false;
    }

    boolean whoGoesFirst() {
        double firstPerson = Math.random() * 100;
        // %50 possibility to hit first
        if (firstPerson < 50) {
            // if true, let f1 hit first
            return true;
        } else {
            // if false, let f2 hit first
            return false;
        }
    }
}
