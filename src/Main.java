import java.util.Scanner;
import java.lang.Math;

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


        /*

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

        */


        //HİPOTENÜS BULMA----------------------------------------------


        /*

        double kisaKenar,uzunKenar,hipotenus;

        Scanner kisa_input = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        kisaKenar = kisa_input.nextDouble();
        Scanner uzun_input = new Scanner(System.in);
        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        uzunKenar = uzun_input.nextDouble();

        hipotenus = Math.sqrt(Math.pow(kisaKenar,2) + Math.pow(uzunKenar,2));
        System.out.println("Hipotenüs değeri: " + hipotenus);

        */

        //ALAN BULMA----------------------------------------------


        /*

        Scanner a_input = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğu: ");
        double birinci = a_input.nextDouble();

        Scanner b_input = new Scanner(System.in);
        System.out.print("İkinci kenar uzunluğu: ");
        double ikinci = b_input.nextDouble();

        Scanner c_input = new Scanner(System.in);
        System.out.print("Üçüncü kenar uzunluğu: ");
        double ucuncu = c_input.nextDouble();

        //System.out.println(birinci + "," + ikinci + "," + ucuncu);

        double cevre = birinci+ikinci+ucuncu;
        double u = cevre/2;
        double alan = Math.sqrt(u*(u-birinci)*(u-ikinci)*(u-ucuncu));

        System.out.print("Cevre: "+ cevre + " Alan: " + alan);

        */

        //TAKSİMETRE----------------------------------------------

        /*
        double acilisUcreti = 10,toplam,km;

        Scanner input = new Scanner(System.in);
        System.out.println("Km değeri giriniz: ");
        km = input.nextDouble();

        toplam = acilisUcreti + 2.20 * km;

        if (toplam<20) {
            toplam = 20;
        }

        System.out.println("Toplam ödenecek tutar: " + toplam + " TL'dir.");

        */


        //DAİRE ÇEVRESİ VE ALANI HESAPLAMA----------------------------------------------

        double yaricap,cevre,alan, pi = 3.14, alfa, dilim_alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değeri giriniz: ");
        yaricap =input.nextDouble();

        cevre = 2 * pi * yaricap;
        alan = pi* Math.pow(yaricap,2);
        //System.out.print("Çevre: "+ cevre + " Alan: " + alan);

        Scanner a_input = new Scanner(System.in);
        System.out.print("Açı değerini giriniz");
        alfa = a_input.nextDouble();

        dilim_alan = alan*alfa/360;
        System.out.println("Daire diliminin alanı: " + dilim_alan);

    }
}
