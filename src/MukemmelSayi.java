import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int toplam=0;

        for (int i = 1; i<sayi; i++) {
            if (sayi%i == 0) {
                toplam+=i;
            }
        }
        if (sayi==toplam) {
            System.out.print(sayi + " mükemmel bir sayıdır.");
        } else{
            System.out.print(sayi + " mükemmel bir sayı değildir.");
        }
    }
}
