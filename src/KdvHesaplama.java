import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen KDV hesaplamak istediğiniz tutarı girin: ");
        tutar = input.nextDouble();
        double kdvliTutar;

        // Tutar 1000'in üzerindeyse KDV oranı 0.08 değilse 0.18 alınacak
        double kdv = tutar>=1000 ?  0.08 : 0.18;
        System.out.println("KDV Oranı: " + kdv);

        kdvliTutar = tutar+tutar*kdv;
        System.out.println("KDV'li tutar: " + kdvliTutar);

    }
}
