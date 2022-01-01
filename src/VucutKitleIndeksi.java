import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {

        double kilo,boy,vki;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfon kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Lütfon boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        vki = kilo / (Math.pow(boy,2));
        System.out.println("Kilonuz: "+ kilo + "\nBoyunuz: " + boy + "\nVücut kitle Indeksiniz: " + vki );

    }
}
