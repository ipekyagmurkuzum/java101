import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // NOT ORTALAMASI-----------------------------------------------

        /*
        int mat, turkce, fizik, kimya, biyo, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Biyoloji notunuzu giriniz: ");
        biyo = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int toplam = mat + turkce + fizik + kimya + biyo + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: " + sonuc);

        System.out.println(sonuc > 60 ? "Sınıfı geçti" : "Sınıfta kaldı");

        */

        //KDV HESAPLAMA-----------------------------------------------


        /*

        double tutar;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen KDV hesaplamak istediğiniz tutarı girin: ");
        tutar = input.nextDouble();
        double kdvliTutar;

        // Tutar 1000'in üzerindeyse KDV oranı 0.08 değilse 0.18 alınacak
        double kdv = tutar>=1000 ?  0.08 : 0.18;
        System.out.println("KDV Oranı: " + kdv);

        kdvliTutar = tutar+tutar*kdv;
        System.out.println("KDV'li tutar: " + kdvliTutar);

        */


        //HİPOTENÜS BULMA----------------------------------------------


        /*

        double kisaKenar,uzunKenar,hipotenus;

        Scanner input = new Scanner(System.in);
        System.out.print("Kısa kenar uzunluğunu giriniz: ");
        kisaKenar = input.nextDouble();

        System.out.print("Uzun kenar uzunluğunu giriniz: ");
        uzunKenar = input.nextDouble();

        hipotenus = Math.sqrt(Math.pow(kisaKenar,2) + Math.pow(uzunKenar,2));
        System.out.println("Hipotenüs değeri: " + hipotenus);

        */

        //ALAN BULMA----------------------------------------------


        /*

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

        */

        //TAKSİMETRE----------------------------------------------

        /*
        double acilisUcreti = 10,toplam,km;

        Scanner input = new Scanner(System.in);
        System.out.println("Km değeri giriniz: ");
        km = input.nextDouble();

        toplam = acilisUcreti + 2.20 * km;

        if (toplam<20) {
            toplam = 20;
        }

        System.out.println("Toplam ödenecek tutar: " + toplam + " TL'dir.");

        */


        //DAİRE ÇEVRESİ VE ALANI HESAPLAMA----------------------------------------------


        /*


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

         */


        //VÜCUT KİTLE ENDEKSİ HESAPLAMA----------------------------------------------


        /*

        double kilo,boy,vki;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfon kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.print("Lütfon boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();
        vki = kilo / (Math.pow(boy,2));
        System.out.println(" Kilonuz: "+ kilo + "Boyunuz: " + boy + "\nVücut kitle Indeksiniz: " + vki );

         */


        //MANAV KASA PROGRAMI----------------------------------------------

        /*

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

        */


        //HAFTANIN GÜNLERİ----------------------------------------------

        /*

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

         */

        //BASİT HESAP MAKİNESİ----------------------------------------------

        /*
        double n1, n2;

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı girin: ");
        n1 = input.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        n2 = input.nextDouble();

        System.out.print("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\nLütfen işlem seçiniz: ");

        int secilenIslem = input.nextInt();

        switch (secilenIslem) {
            case 1:
                System.out.print(n1 + n2);
                break;
            case 2:
                System.out.print(n1 - n2);
                break;
            case 3:
                System.out.print(n1 * n2);
                break;
            case 4:
                if (n2 != 0) {
                    System.out.print(n1 / n2);
                } else {
                    System.out.print("Bir sayı 0'a bölünemez.");
                }
                break;
            default:
                System.out.print("Hatalı bir sayı girdiniz. Lütfen tekrar deneyin.");
        }

         */


        //KULLANICI GİRİŞİ----------------------------------------------


        /*
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

         */


        //SINIF GEÇME DURUMU----------------------------------------------


        /*
        int mat, fizik, kimya, biyo, muzik, sayac = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin: ");
        mat = input.nextInt();
        boolean kosul1 = (mat <= 100) && (mat > 0);
        if (kosul1 == true) {
            sayac = sayac + 1;
        } else {
            mat = 0;
        }

        System.out.print("Fizik notunuzu girin: ");
        fizik = input.nextInt();
        boolean kosul2 = (fizik <= 100) && (fizik > 0);
        if (kosul2 == true) {
            sayac = sayac + 1;
        } else {
            fizik = 0;
        }

        System.out.print("Kimya notunuzunu girin: ");
        kimya = input.nextInt();
        boolean kosul3 = (kimya <= 100) && (kimya > 0);
        if (kosul3 == true) {
            sayac = sayac + 1;
        } else {
            kimya = 0;
        }

        System.out.print("Biyoloji notunuzu girin: ");
        biyo = input.nextInt();
        boolean kosul4 = (biyo <= 100) && (biyo > 0);
        if (kosul4 == true) {
            sayac = sayac + 1;
        } else {
            biyo = 0;
        }

        System.out.print("Müzik notunuzu girin: ");
        muzik = input.nextInt();
        boolean kosul5 = (muzik <= 100) && (muzik > 0);
        if (kosul5 == true) {
            sayac = sayac + 1;
        } else {
            muzik = 0;
        }

        if (sayac > 0) {
            double ortalama = (mat + fizik + kimya + biyo + muzik) / sayac;
            if (ortalama <= 55) {
                System.out.print("Ortalamanız " + ortalama + ".\nSınıfta kaldınız. ");
            } else {
                System.out.print("Ortalamanız " + ortalama + ".\nTebrikler! Sınıfı geçtiniz. ");
            }
        } else {
            System.out.print("Lütfen 0-100 arası not giriniz. ");
        }


         */


        //HAVA SICAKLIĞINA GÖRE ETKİNLİK ÖNERME----------------------------------------------


        /*

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


         */


        //GİRİLEN 4 SAYIYI KÜÇÜKTEN BÜYÜĞE SIRALAMA----------------------------------------------


        /*

        int i;
        int [] arr = new int [4];

        for (i=0;i<4;i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Bir sayı giriniz: ");
            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

         */


        //BURÇ BULMA----------------------------------------------


        /*

        int gun, ay;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğduğunuz ayı giriniz (1-12): ");
        ay = input.nextInt();

        System.out.print("Lütfen doğduğunuz günü giriniz (1-31): ");
        gun = input.nextInt();

        String burc = "";
        boolean hataliMi = false;

        if ((ay <= 12) && (ay > 0)) {

            if (ay == 1) {
                if ((gun > 0) && (gun <= 21)) {
                    burc = "Oglak";
                } else if ((gun > 21) && (gun <= 31)) {
                    burc = "Kova";
                } else {
                    hataliMi = true;
                }
            }
            if (ay == 2) {
                if ((gun > 0) && (gun <= 19)) {
                    burc = "Kova";
                } else if ((gun > 19) && (gun <= 29)) {
                    burc = "Balık";
                } else {
                    hataliMi = true;
                }
            }
            if (ay == 3) {
                if ((gun > 0) && (gun <= 20)) {
                    burc = "Balık";
                } else if ((gun > 20) && (gun <= 31)) {
                    burc = "Koç";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 4) {
                if ((gun > 0) && (gun <= 20)) {
                    burc = "Koç";
                } else if ((gun > 20) && (gun <= 30)) {
                    burc = "Boğa";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 5) {
                if ((gun > 0) && (gun <= 21)) {
                    burc = "Boğa";
                } else if ((gun > 21) && (gun <= 31)) {
                    burc = "İkizler";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 6) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "İkizler";
                } else if ((gun > 22) && (gun <= 30)) {
                    burc = "Yengeç";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 7) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "Yengeç";
                } else if ((gun > 22) && (gun <= 31)) {
                    burc = "Aslan";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 8) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "Aslan";
                } else if ((gun < 22) && (gun <= 31)) {
                    burc = "Başak";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 9) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "Başak";
                } else if ((gun > 22) && (gun <= 30)) {
                    burc = "Terazi";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 10) {
                if ((gun > 0) && (gun <= 22)) {
                    burc = "Terazi";
                } else if ((gun > 22) && (gun <= 31)) {
                    burc = "Akrep";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 11) {
                if ((gun > 0) && (gun <= 21)) {
                    burc = "Akrep";
                } else if ((gun > 21) && (gun <= 30)) {
                    burc = "Yay";
                } else {
                    hataliMi = true;
                }
            }

            if (ay == 12) {
                if ((gun > 0) && (gun <= 21)) {
                    burc = "Yay";
                } else if ((gun > 21) && (gun <= 31)) {
                    burc = "Oğlak";
                } else {
                    hataliMi = true;
                }
            }

            if (!hataliMi) {
                System.out.print("Burcunuz: " + burc);
            } else {
                System.out.print("Hatalı gün değeri!");
            }
        } else {
            System.out.print("Hatalı değer!");
        }


         */


        //UÇAK BİLETİ FİYATI HESAPLAMA----------------------------------------------

        /*

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        int km = input.nextInt();
        boolean kosul1 = (km > 0);

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        boolean kosul2 = (yas > 0);

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        int yolculukTipi = input.nextInt();
        boolean kosul3 = ((yolculukTipi == 1) || (yolculukTipi == 2));

        boolean kosul = (kosul1 && kosul2 && kosul3);

        if (kosul) {
            double biletFiyati = 0.1 * km;
            if (yas < 12) {
                biletFiyati *= 0.5;
            } else if ((yas >= 12) && (yas <= 24)) {
                biletFiyati *= 0.9;
            } else if (yas > 65) {
                biletFiyati *= 0.7;
            }
            if (yolculukTipi == 2) {
                biletFiyati *= 1.6;
            }
            System.out.print(biletFiyati);
        } else {
            System.out.print("Hatalı giriş yaptınız.");
        }

         */


        //ÇİN ZODYAĞI----------------------------------------------


        /*


        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        int yil = input.nextInt();

        int zodyak = yil % 12;

        switch (zodyak) {
            case 0:
                System.out.print("Çin Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz : Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz : Koyun");
                break;
            default:
                System.out.print("Hatalı giriş yaptınız.");
        }


         */


        //ARTIK YIL HESAPLAMA----------------------------------------------

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz: ");
        int yil = input.nextInt();

        if (yil % 100 == 0) {
            if (yil % 400 == 0) {
                System.out.print(yil + " artık bir yıldır.");
            } else {
                System.out.print(yil + " artık bir yıl değildir.");
            }
        } else if ((yil % 4 == 0)){
            System.out.print(yil + " artık bir yıldır.");
        } else {
            System.out.print(yil + " artık bir yıl değildir.");
        }
    }
}


