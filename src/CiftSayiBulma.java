import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int number = input.nextInt();
        int i = 0;

        while (i<=number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
