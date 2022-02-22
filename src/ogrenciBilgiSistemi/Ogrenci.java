package ogrenciBilgiSistemi;

public class Ogrenci {
    Ders d1;
    Ders d2;
    Ders d3;
    double ort1;
    double ort2;
    double ort3;
    String ad;
    String ogrno;
    String sinif;
    double ort;
    boolean gectiMi;


    Ogrenci(String ad, String ogrno, String sinif, Ders d1, Ders d2, Ders d3) {
        this.ad = ad;
        this.ogrno = ogrno;
        this.sinif = sinif;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.ort = 0.0;
        this.gectiMi = false;
        this.ort1= 0.0;
        this.ort2= 0.0;
        this.ort3= 0.0;
    }

    void notEkle(int not1, int not2, int not3) {
        if (not1 >= 0 && not1 <= 100) {
            this.d1.not = not1;
        }

        if (not2 >= 0 && not2 <= 100) {
            this.d2.not = not2;
        }

        if (not3 >= 0 && not3 <= 100) {
            this.d3.not = not3;
        }
    }

    void sozluNotuekle(int sozlu1, int sozlu2, int sozlu3) {
        if (sozlu1 >= 0 && sozlu1 <= 100) {
            this.d1.sozlu = sozlu1;
        }
        if (sozlu2 >= 0 && sozlu2 <= 100) {
            this.d2.sozlu = sozlu2;
        }
        if (sozlu3 >= 0 && sozlu3 <= 100) {
            this.d3.sozlu = sozlu3;
        }
    }
    void gectiMi() {
        this.ort1= this.d1.not*0.8+ this.d1.sozlu*0.2;
        this.ort2= this.d2.not*0.8+ this.d2.sozlu*0.2;
        this.ort3= this.d3.not*0.8+ this.d3.sozlu*0.2;

        this.ort = (ort1+ort2+ort3) / 3.0;
        if (this.ort > 50) {
            this.gectiMi = true;
            System.out.println("Geçtiniz.");
        } else {
            System.out.println("Kaldınız.");
        }
        notYazdir();
    }

    void notYazdir() {
        System.out.println(d1.ad + " Notu: " + this.ort1);
        System.out.println(d2.ad + " Notu: " + this.ort2);
        System.out.println(d3.ad + " Notu: " + this.ort3);
        System.out.print("Ortalamanız: " + this.ort);

    }
}
