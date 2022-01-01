import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {

        double kisaKenar,uzunKenar,hipotenus;

        Scanner input = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        kisaKenar = input.nextDouble();

        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        uzunKenar = input.nextDouble();

        if (kisaKenar>uzunKenar) {
            System.out.print("Kısa kenar değeri uzun kenar değerinden büyük olamaz.");
        } else {
            hipotenus = Math.sqrt(Math.pow(kisaKenar, 2) + Math.pow(uzunKenar, 2));
            System.out.println("Hipotenüs değeri: " + hipotenus);
        }

    }
}
