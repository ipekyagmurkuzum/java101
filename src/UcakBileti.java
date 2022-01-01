import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        int km = input.nextInt();
        boolean kosul1 = (km > 0);

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        boolean kosul2 = (yas > 0);

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = input.nextInt();
        boolean kosul3 = ((yolculukTipi == 1) || (yolculukTipi == 2));

        boolean kosul = (kosul1 && kosul2 && kosul3);

        if (kosul) {
            double biletFiyati = 0.1 * km;
            if (yas < 12) {
                biletFiyati *= 0.5;
            } else if ((yas >= 12) && (yas <= 24)) {
                biletFiyati *= 0.9;
            } else if (yas > 65) {
                biletFiyati *= 0.7;
            }
            if (yolculukTipi == 2) {
                biletFiyati *= 1.6;
            }
            System.out.print(biletFiyati);
        } else {
            System.out.print("Hatalı giriş yaptınız.");
        }

    }
}
