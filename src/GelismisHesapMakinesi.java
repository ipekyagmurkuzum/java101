import java.util.Scanner;

public class GelismisHesapMakinesi {


    static void sum() {
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int b = scan.nextInt();
        System.out.println("Sonuç : " + (a + b));
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int b = scan.nextInt();
        System.out.println("Sonuç : " + (a - b));
    }

    static void multiply() {
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int b = scan.nextInt();
        System.out.println("Sonuç : " + (a * b));
    }

    static void divide() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bölünen: ");
        int a = scan.nextInt();
        System.out.print("Bölüm: ");
        int b = scan.nextInt();
        if(b==0) {
            System.out.println("Tanımsız.");
        }
        System.out.println("Sonuç : " + (a / b));
    }

    static void usAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("Üs sayıyı girin: ");
        int b = scan.nextInt();
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }
        System.out.println("Sonuç : " + sonuc);
    }

    static void faktoriyel() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int sayi = scan.nextInt();
        int fakt = 1;
        for (int i = 1; i <= sayi; i++) {
            fakt *= i;
        }
        System.out.println("Sonuç : " + fakt);
    }

    static void modAl() {
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayıyı girin: ");
        int a = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int b = scan.nextInt();
        System.out.println("Sonuç : " + (a % b));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        System.out.println(menu);

        while (true) {
            System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
            select = scan.nextInt();
            if (select == 0) {
                System.out.println("Güle güle!");
                break;
            }
            switch (select) {
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                case 8:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    usAl();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAl();
                    break;
                default:
                    break;
            }
        }
    }
}
