import java.util.Scanner;

public class BasitHesapMakinesi {
    public static void main(String[] args) {

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
    }
}
