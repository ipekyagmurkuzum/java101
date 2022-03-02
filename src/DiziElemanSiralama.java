import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSiralama {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olacak? : ");
        int eleman = scanner.nextInt();
        int i=1;
        int[] dizi = new int[eleman];
        while (i <= eleman) {
            System.out.print(i + ". elamanı giriniz : ");
            dizi[i-1] = scanner.nextInt();
            i++;
        }
        Arrays.sort(dizi);
        System.out.print("Sıralama : ");
        for (int value : dizi) {
            System.out.print(value + " ");
        }

    }
}
