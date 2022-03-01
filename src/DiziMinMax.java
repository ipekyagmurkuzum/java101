import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DiziMinMax {
    public static void main(String[] args) {
        int[] num = {1, 43, 5, 18, -2, 36, 57};
        Arrays.sort(num);
        int min=0,max=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı giriniz:");

        int nm = scan.nextInt();

        for (int i:num) {
            if(i<nm){
                min=i;
            }
            else if(i>nm){
                max=i;
                break;
            }

        }
        System.out.println("Girilen sayıdan küçük en yakın sayı : "+min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : "+max);
    }
}

