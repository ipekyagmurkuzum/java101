import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz: ");
        int yil = input.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print(yil + " artık bir yıldır.");
            } else {
                System.out.print(yil + " artık bir yıl değildir.");
            }
        } else if ((yil % 4 == 0)) {
            System.out.print(yil + " artık bir yıldır.");
        } else {
            System.out.print(yil + " artık bir yıl değildir.");
        }
    }

}