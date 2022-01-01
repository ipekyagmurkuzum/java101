import java.util.Scanner;

public class UcgenAlaniBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci kenar uzunluğu: ");
        double birinci = input.nextDouble();

        System.out.print("İkinci kenar uzunluğu: ");
        double ikinci = input.nextDouble();

        System.out.print("Üçüncü kenar uzunluğu: ");
        double ucuncu = input.nextDouble();

        //System.out.println(birinci + "," + ikinci + "," + ucuncu);

        double cevre = birinci+ikinci+ucuncu;
        double u = cevre/2;
        double alan = Math.sqrt(u*(u-birinci)*(u-ikinci)*(u-ucuncu));

        System.out.print("Cevre: "+ cevre + " Alan: " + alan);

    }
}
