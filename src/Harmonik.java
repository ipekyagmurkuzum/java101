import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N değeri giriniz: ");
        int n =input.nextInt();
        double sonuc =0;
        for(int i=1;i<=n;i++) {
            sonuc += 1.0/i;
        }
        System.out.print(sonuc);
    }
}
