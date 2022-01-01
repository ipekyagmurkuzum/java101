import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {

        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo,
                armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlicanKilo = input.nextDouble();

        double sepet = armutFiyat*armutKilo + elmaFiyat*elmaKilo + domatesFiyat*domatesKilo + muzFiyat*muzKilo + patlicanFiyat*patlicanKilo;

        System.out.println("Toplam sepet tutarı: " + sepet + " TL'dir.");

    }
}
