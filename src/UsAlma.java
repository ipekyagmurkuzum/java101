import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Sınır giriniz: ");
        int sinir = scan.nextInt();
        int i = 1,j = 1;
        while (i<=sinir || j<=sinir) {
            if (i<=sinir) {
                System.out.println(i);
                i*=4;
            }
            if(j<=sinir) {
                System.out.println(j);
                j *= 5;
            }
        }
    }
}
