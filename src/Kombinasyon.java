import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
//        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı
//        n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
//
//        Java ile kombinasyon hesaplayan program yazınız.
//
//        Kombinasyon formülü
//        C(n,r) = n! / (r! * (n-r)!)

        int nfakt = 1,rfakt = 1, nrfakt = 1;

        Scanner scan = new Scanner(System.in);
        System.out.print("n değeri giriniz: ");
        int nDegeri = scan.nextInt();
        System.out.print("r değeri giriniz: ");
        int rDegeri = scan.nextInt();

        for (int i = 1; i <= nDegeri; i++) {
            nfakt *= i;
        }
        for (int i = 1; i <= rDegeri; i++) {
            rfakt *= i;
        }
        for (int i = 1; i <= nDegeri - rDegeri; i++) {
            nrfakt *= i;
        }
        int kombinasyon = nfakt / (rfakt * nrfakt);
        System.out.print(kombinasyon);
    }

}

