import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1.Sayı: ");
        int sayi1 = input.nextInt();
        System.out.print("2.Sayı: ");
        int sayi2 = input.nextInt();

        int i=sayi1,ebob=1;
        while (i<=sayi1) {
            if(sayi1%i ==0 && sayi2%i ==0) {
                ebob=i;
                break;
            }
            i--;
        } System.out.println("EBOB : "+ ebob);



        int k=sayi1,ekok=1;

        while (k<=sayi1*sayi2) {
            if(k%sayi1 ==0 && k%sayi2==0) {
                ekok = k;
                break;
            }
            k++;
        } System.out.print("EKOK : " + ekok);


    }
}
