import java.util.Arrays;
import java.util.Scanner;

public class GirilenDortSayiyiSiralama {
    public static void main(String[] args) {

        int[] arr = new int[4];
        int i;
        for (i = 0; i < 4; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));
    }
}
