import java.util.Scanner;

public class RecursivePattern {

    static int pattern(int temp, int count, int a) {
        if (count > 0) {
            System.out.print(temp + " ");
            return pattern(temp - 5, count - 1, a);
        } else {
            if(temp==a) {
                System.out.print(temp);
                return a;
            }
            System.out.print(temp+ " ");
            return pattern(temp + 5, count - 1, a);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        int a = scan.nextInt();
        int temp = a;
        int count;
        if (a % 5 == 0) {
            count = a / 5;
        } else {
            count = a / 5 + 1;
        }
        pattern(temp, count,a);
    }
}
