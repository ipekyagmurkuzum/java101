import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Eleman sayısı giriniz: ");
        int eleman = scan.nextInt();
        int first=0;
        int second=1;
        int sayi;
        System.out.print(first+" "+ second +" ");

        for (int i =0; i<eleman-2;i++) {
            sayi=first+second;
            first=second;
            second=sayi;
            System.out.print(sayi+ " ");
        }

    }
}



