import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, kimya, biyo, muzik, sayac = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        mat = input.nextInt();
        boolean kosul1 = (mat <= 100) && (mat > 0);
        if (kosul1 == true) {
            sayac = sayac + 1;
        } else {
            mat = 0;
        }

        System.out.print("Fizik notunuzu girin: ");
        fizik = input.nextInt();
        boolean kosul2 = (fizik <= 100) && (fizik > 0);
        if (kosul2 == true) {
            sayac = sayac + 1;
        } else {
            fizik = 0;
        }

        System.out.print("Kimya notunuzunu girin: ");
        kimya = input.nextInt();
        boolean kosul3 = (kimya <= 100) && (kimya > 0);
        if (kosul3 == true) {
            sayac = sayac + 1;
        } else {
            kimya = 0;
        }

        System.out.print("Biyoloji notunuzu girin: ");
        biyo = input.nextInt();
        boolean kosul4 = (biyo <= 100) && (biyo > 0);
        if (kosul4 == true) {
            sayac = sayac + 1;
        } else {
            biyo = 0;
        }

        System.out.print("Müzik notunuzu girin: ");
        muzik = input.nextInt();
        boolean kosul5 = (muzik <= 100) && (muzik > 0);
        if (kosul5 == true) {
            sayac = sayac + 1;
        } else {
            muzik = 0;
        }

        if (sayac > 0) {
            double ortalama = (mat + fizik + kimya + biyo + muzik) / sayac;
            if (ortalama <= 55) {
                System.out.print("Ortalamanız " + ortalama + ".\nSınıfta kaldınız. ");
            } else {
                System.out.print("Ortalamanız " + ortalama + ".\nTebrikler! Sınıfı geçtiniz. ");
            }
        } else {
            System.out.print("Lütfen 0-100 arası not giriniz. ");
        }


    }
}
