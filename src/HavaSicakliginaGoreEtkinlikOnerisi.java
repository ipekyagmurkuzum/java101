import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlikOnerisi {
    public static void main(String[] args) {

        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sıcaklık değeri giriniz: ");
        sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.print("Kayak yapabilirsiniz.");
        } else if ((sicaklik >= 5) && (sicaklik <= 25)) {
            if (sicaklik <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (sicaklik >= 10) {
                System.out.print("Pikniğe gidebilirsiniz.");
            }
        } else if (sicaklik > 25) {
            System.out.print("Yüzmeye gidebilirsiniz.");
        }

    }
}
