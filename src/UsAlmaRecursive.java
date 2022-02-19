import java.util.Scanner;

public class UsAlmaRecursive {

    static double usAlma(double a, double b) {
        if (b > 0) {
            return usAlma(a, b - 1) * a;
        } else if (b < 0) {
            return usAlma(a, b + 1) / a;
        } else if (b == 0) {
            return 1;
        }
        return usAlma(a, b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int a = scan.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int b = scan.nextInt();
        System.out.println("Sonuç: " + usAlma(a, b));
    }
}
