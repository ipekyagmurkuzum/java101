public class TekrarEdenCiftler {

    static boolean isFind(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] dizi = {88, 73, 14, 3, 88, 15, 3, 9, 14, 88};
        int[] duplicate = new int[dizi.length];
        int duplicateIndex = 0;
        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j] && (dizi[i] % 2 == 0)) {
                    if (!isFind(duplicate, dizi[i])) {
                        duplicate[duplicateIndex++] = dizi[i];
                    }
                }
            }
        }
        for(int value : duplicate) {
            if (value!=0)
            System.out.println(value);
        }
    }
}
