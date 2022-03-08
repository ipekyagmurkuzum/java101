import java.util.Arrays;
import java.util.List;

public class DiziFrekansBulma {


    static boolean isFind(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[dizi.length];
        int duplicateIndex = 0;
        for (int i = 0; i < dizi.length; i++) {
            int n = 0;
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    n++;
                }
            }
            if (!isFind(duplicate, dizi[i])) {
                duplicate[duplicateIndex++] = dizi[i];
                System.out.println(dizi[i] + " sayısı " + n + " kere tekrar edildi.");
            }
        }
    }
}