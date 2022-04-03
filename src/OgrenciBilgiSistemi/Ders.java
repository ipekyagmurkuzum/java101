package OgrenciBilgiSistemi;

public class Ders {
    Ogretmen ogretmen;
    String ad;
    String kod;
    String kisaltma;
    int not;
    int sozlu;

    Ders(String ad, String kod, String kisaltma) {
        this.ad = ad;
        this.kod = kod;
        this.kisaltma = kisaltma;
        int not = 0;
        int sozlu=0;
    }

    void ogretmenEkle(Ogretmen ogretmen) {
        if (ogretmen.brans.equals(this.kisaltma)) {
            this.ogretmen = ogretmen;
            //          printTeacherInfo();
        } else {
            System.out.print("Öğretmen ve ders kodu uyuşmuyor!");
        }
    }

    void ogretmenYazdir() {
        this.ogretmen.print();
    }
}
