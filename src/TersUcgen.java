import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Basamak sayısı giriniz: ");
        int basamak = scanner.nextInt();
        int temp = basamak;
        for (int i= 1; i<=basamak;i++) {
            for (int j = 0; j<=i-1;j++) {
                System.out.print(" ");
            }
            for (int k=temp*2-1;k>0;k--) {
                System.out.print("*");
            }
            temp--;
            System.out.println();
        }
    }
}
