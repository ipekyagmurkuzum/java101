package BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 100, 15, 100,20);
        Fighter f2 = new Fighter("B", 90, 20, 95,16);
        Match match = new Match(f1, f2, 90, 100);
        match.run();
    }
}
