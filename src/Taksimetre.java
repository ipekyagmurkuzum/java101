import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        double acilisUcreti = 10,toplam,km;

        Scanner input = new Scanner(System.in);
        System.out.println("Km değeri giriniz: ");
        km = input.nextDouble();

        toplam = acilisUcreti + 2.20 * km;

        if (toplam<20) {
            toplam = 20;
        }

        System.out.println("Toplam ödenecek tutar: " + toplam + " TL'dir.");

    }
}
