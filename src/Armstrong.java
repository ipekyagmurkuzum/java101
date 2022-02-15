import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        int uzunluk = 0, temp;
        int mod, toplam = 0;
        int us = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        temp = sayi;
        while (!(temp == 0)) {
            temp /= 10;
            uzunluk++;
        }

        temp = sayi;
        while (!(temp == 0)) {
            us = 1;
            mod = temp % 10;
            // toplam += mod;
            //  temp /= 10;

            for (int i = 1; i <= uzunluk; i++) {
                us *= mod;
            }
            temp /= 10;
            toplam += us;
        }
        if (toplam == sayi) {
            System.out.print("Armstrong");
        } else {
            System.out.print("Armstrong değil");
        }

    }
}