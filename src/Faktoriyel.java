import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();
        int fakt = 1;
        for (int i=1; i<=sayi; i++) {
            fakt*=i;
        }
        System.out.print(fakt);
    }
}
