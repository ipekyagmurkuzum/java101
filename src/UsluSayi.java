import java.util.Scanner;

public class UsluSayi {
    public static void main(String[] args) {

        int us =1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Üsü alınacak sayı değeri giriniz: ");
        int nDegeri = scan.nextInt();
        System.out.print("Üs olacak sayı değeri giriniz: ");
        int rDegeri = scan.nextInt();

        for (int i=1; i<=rDegeri; i++) {
            us*=nDegeri;
        }
        System.out.print(us);
    }
}
