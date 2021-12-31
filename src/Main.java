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

        Scanner input = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        kisaKenar = input.nextDouble();

        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        uzunKenar = input.nextDouble();

        hipotenus = Math.sqrt(Math.pow(kisaKenar,2) + Math.pow(uzunKenar,2));
        System.out.println("Hipotenüs değeri: " + hipotenus);

        */

        //ALAN BULMA----------------------------------------------


        /*

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğu: ");
        double birinci = input.nextDouble();

        System.out.print("İkinci kenar uzunluğu: ");
        double ikinci = input.nextDouble();

        System.out.print("Üçüncü kenar uzunluğu: ");
        double ucuncu = input.nextDouble();

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


        /*


        double yaricap,cevre,alan, pi = 3.14, alfa, dilim_alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değeri giriniz: ");
        yaricap =input.nextDouble();

        cevre = 2 * pi * yaricap;
        alan = pi* Math.pow(yaricap,2);
        //System.out.print("Çevre: "+ cevre + " Alan: " + alan);

        Scanner a_input = new Scanner(System.in);
        System.out.print("Açı değerini giriniz: ");
        alfa = a_input.nextDouble();

        dilim_alan = alan*alfa/360;
        System.out.println("Daire diliminin alanı: " + dilim_alan);

         */


        //VÜCUT KİTLE ENDEKSİ HESAPLAMA----------------------------------------------


        /*

        double kilo,boy,vki;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfon kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Lütfon boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        vki = kilo / (Math.pow(boy,2));
        System.out.println(" Kilonuz: "+ kilo + "Boyunuz: " + boy + "\nVücut kitle Indeksiniz: " + vki );

         */


        //MANAV KASA PROGRAMI----------------------------------------------

        /*

        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo,
                armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlicanKilo = input.nextDouble();

        double sepet = armutFiyat*armutKilo + elmaFiyat*elmaKilo + domatesFiyat*domatesKilo + muzFiyat*muzKilo + patlicanFiyat*patlicanKilo;

        System.out.println("Toplam sepet tutarı: " + sepet + " TL'dir.");

        */


        //HAFTANIN GÜNLERİ----------------------------------------------

        /*

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Bugün günlerden pazartesi");
                break;
            case 2:
                System.out.println("Bugün günlerden salı");
                break;
            case 3:
                System.out.println("Bugün günlerden çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerden perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerden cuma");
                break;
            case 6:
                System.out.println("Bugün günlerden cumartesi");
                break;
            case 7:
                System.out.println("Bugün günlerden pazar");
                break;
            default:
                System.out.println("Lütfen 1'den 7'ye kadar bir sayı giriniz.");

         */

        //BASİT HESAP MAKİNESİ----------------------------------------------

        /*
        double n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        n1 = input.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        n2 = input.nextDouble();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nLütfen işlem seçiniz: ");

        int secilenIslem = input.nextInt();

        switch (secilenIslem) {
            case 1:
                System.out.print(n1 + n2);
                break;
            case 2:
                System.out.print(n1 - n2);
                break;
            case 3:
                System.out.print(n1 * n2);
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print(n1 / n2);
                } else {
                    System.out.print("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.print("Hatalı bir sayı girdiniz. Lütfen tekrar deneyin.");
        }

         */


        //KULLANICI GİRİŞİ----------------------------------------------

        String kullaniciAdi = "patika", sifre = "java101", kullaniciAdi_input, sifre_input;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi_input = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre_input = input.nextLine();

        if (kullaniciAdi_input.equals(kullaniciAdi) && sifre_input.equals(sifre)) {
            System.out.print("Giriş başarılı!");
        } else if (!(sifre_input.equals("java101"))) {
            System.out.print("Yanlış şifre girdiniz. Şifrenizi sıfırlamak için lütfen 1'e basın.");
            int secenek = input.nextInt();
            input.nextLine();
            if (secenek == 1) {
                System.out.print("Lütfen yeni şifrenizi girin: ");
                String yeni_sifre = input.nextLine();
                if (yeni_sifre.equals(sifre) || yeni_sifre.equals(sifre_input)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    sifre = yeni_sifre;
                    System.out.print("Şifre oluşturuldu.");
                }
            } else {
                System.out.print("İşlem iptal edildi.");
            }
        } else {
            System.out.print("Lütfen bilgilerinizi kontrol ediniz.");
        }
    }
}

