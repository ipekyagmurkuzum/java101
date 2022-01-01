import java.util.Scanner;

public class DaireCevreVeAlan {
    public static void main(String[] args) {

        double yaricap,cevre,alan, pi = 3.14, alfa, dilim_alan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarıçap değeri giriniz: ");
        yaricap =input.nextDouble();

        cevre = 2 * pi * yaricap;
        alan = pi* Math.pow(yaricap,2);
        //System.out.print("Çevre: "+ cevre + " Alan: " + alan);

        Scanner a_input = new Scanner(System.in);
        System.out.print("Açı değerini giriniz: ");
        alfa = a_input.nextDouble();

        dilim_alan = alan*alfa/360;
        System.out.println("Daire diliminin alanı: " + dilim_alan);

    }
}
