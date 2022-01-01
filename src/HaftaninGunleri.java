import java.util.Scanner;

public class HaftaninGunleri {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Bugün günlerden pazartesi");
                break;
            case 2:
                System.out.println("Bugün günlerden salı");
                break;
            case 3:
                System.out.println("Bugün günlerden çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerden perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerden cuma");
                break;
            case 6:
                System.out.println("Bugün günlerden cumartesi");
                break;
            case 7:
                System.out.println("Bugün günlerden pazar");
                break;
            default:
                System.out.println("Lütfen 1'den 7'ye kadar bir sayı giriniz.");

        }
    }
}
