import java.util.Scanner;

public class ATMProjesi {
    public static void main(String[] args) {

        String kullaniciAdi, sifre;
        int kalanHak = 3;
        int islem, bakiye = 1200;
        boolean oturum = true;
        Scanner input = new Scanner(System.in);

        while (kalanHak > 0) {
            System.out.print("Kullanıcı Adı giriniz: ");
            kullaniciAdi = input.nextLine();
            System.out.print("Şifre giriniz: ");
            sifre = input.nextLine();

            if (kullaniciAdi.equals("patika") & (sifre.equals("dev123"))) {
                while (oturum) {
                    System.out.println("1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgulama\n" +
                            "4-Çıkış\n" +
                            "Lütfen yapmak istediğiniz işlemi seçin:");
                    islem = input.nextInt();
                    switch (islem) {
                        case 1:
                            System.out.print("Yatırılacak tutarı giriniz: ");
                            int tutar = input.nextInt();
                            bakiye += tutar;
                            System.out.println("Yatırma işlemi başarılı. Yeni bakiyeniz: " + bakiye);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            tutar = input.nextInt();
                            if (tutar <= bakiye) {
                                bakiye -= tutar;
                                System.out.println("Çekme işlemi başarılı. Yeni bakiyeniz: " + bakiye);
                            } else {
                                System.out.println("Yetersiz bakiye.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                        case 4:
                            System.out.println("Başarıyla çıkış yaptınız.");
                            oturum = false;
                            kalanHak=0;
                            break;
                        default:
                            System.out.println("Hatalı tuşlama yaptınız. ");
                            break;
                    }
                }
            } else {
                --kalanHak;
                System.out.println("Hatalı giriş yaptınız.");
                if (kalanHak == 0) {
                    System.out.print("Hesabınız bloke olmuştur.");
                }
            }
        }
    }
}
