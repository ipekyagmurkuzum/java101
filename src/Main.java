import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // NOT ORTALAMASI-----------------------------------------------

        /*
        int mat, turkce, fizik, kimya, biyo, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Biyoloji notunuzu giriniz: ");
        biyo = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int toplam = mat + turkce + fizik + kimya + biyo + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        System.out.println(sonuc > 60 ? "Sınıfı geçti" : "Sınıfta kaldı");

        */

        //KDV HESAPLAMA-----------------------------------------------

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



        //-----------------------------------------------


    }
}
