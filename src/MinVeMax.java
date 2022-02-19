import java.util.Scanner;

public class MinVeMax {
    public static void main(String[] args) {

        int enKucuk=0;
        int enBuyuk=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int kacSayi = input.nextInt();

        for (int i = 1; i <= kacSayi; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int sayi= input.nextInt();
            if(i==1) {
                enBuyuk = sayi;
                enKucuk = sayi;
            }
            if(sayi<enKucuk) {
                enKucuk=sayi;
            }
            if(sayi>enBuyuk) {
                enBuyuk=sayi;
            }
        }
        System.out.print("En büyük sayı: " + enBuyuk+ "\n");
        System.out.print("En küçük sayı: " + enKucuk);
    }

}
