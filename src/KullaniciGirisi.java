import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        String kullaniciAdi = "patika", sifre = "java101", kullaniciAdi_input, sifre_input;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        kullaniciAdi_input = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        sifre_input = input.nextLine();

        if (kullaniciAdi_input.equals(kullaniciAdi) && sifre_input.equals(sifre)) {
            System.out.print("Giriş başarılı!");
        } else if (!(sifre_input.equals("java101"))) {
            System.out.print("Yanlış şifre girdiniz. Şifrenizi sıfırlamak için lütfen 1'e basın.");
            int secenek = input.nextInt();
            input.nextLine();
            if (secenek == 1) {
                System.out.print("Lütfen yeni şifrenizi girin: ");
                String yeni_sifre = input.nextLine();
                if (yeni_sifre.equals(sifre) || yeni_sifre.equals(sifre_input)) {
                    System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    sifre = yeni_sifre;
                    System.out.print("Şifre oluşturuldu.");
                }
            } else {
                System.out.print("İşlem iptal edildi.");
            }
        } else {
            System.out.print("Lütfen bilgilerinizi kontrol ediniz.");
        }

    }
}
