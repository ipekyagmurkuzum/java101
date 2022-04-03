package OgrenciBilgiSistemi;

public class Ogretmen {
    String ad;
    String telno;
    String brans;

    Ogretmen(String ad, String telno, String brans) {
        this.ad = ad;
        this.telno = telno;
        this.brans = brans;
    }

    void print() {
        System.out.println("Öğretmen: " + this.ad);
        System.out.println("Telefonu: " + this.telno);
        System.out.println("Branşı: " + this.brans);
    }

}
