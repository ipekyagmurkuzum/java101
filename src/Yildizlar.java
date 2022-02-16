import java.util.Scanner;

public class Yildizlar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Düzgün bir görünüm için lütfen TEK bir sayı değeri giriniz: ");
        int basamak = input.nextInt();
        int orta = (basamak / 2) + 1;
        int temp= basamak;
        for (int i = 1; i <= basamak; i++) {
            while (i <= orta) {
                for (int j = 1; j <= orta - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }
                i++;
                System.out.println();
            }
            while (i >= orta & i<=basamak) {
                for (int j = 1; j <= i - orta; j++) {
                    System.out.print(" ");
                }
                for (int k = 1 ; k <= temp-2; k++) {
                    System.out.print("*");
                }
                temp-=2;
                i++;
                System.out.println();
            }
        }
    }
}

//        int i=1,j=1,k=1;
//
//        while (i<=basamak) {
//            while (j<=(basamak-i)) {
//                System.out.print(" ");
//                j++;
//            }
//            j=1;
//            while (k<=(2*i-1)) {
//                System.out.print("*");
//                k++;
//            }
//            k=1;
//            i++;
//            System.out.println();
//        }
//

//
//        for (int i = 1; i <= basamak; i++) {
//            for (int j = 1; j <= (basamak - i); j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= ((2 * i) - 1); k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

