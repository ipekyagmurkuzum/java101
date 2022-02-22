package ogrenciBilgiSistemi;

public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Ogretmen ogretmen1 = new Ogretmen("Halil","0554","TRH");
        Ogretmen ogretmen2 = new Ogretmen("Sezai", "0555","BİYO");
        Ogretmen ogretmen3 = new Ogretmen("Perihan", "0552","KMY");

        Ders d1= new Ders("Tarih","101","TRH");
        d1.ogretmenEkle(ogretmen1);
        Ders d2= new Ders("Biyo","101","BİYO");
        d2.ogretmenEkle(ogretmen2);
        Ders d3= new Ders("Kimya","101","KMY");
        d3.ogretmenEkle(ogretmen3);

        Ogrenci ogrenci = new Ogrenci("İpek", "2017503052","4",d1,d2,d3);
        ogrenci.notEkle(100,65,50);
        ogrenci.sozluNotuekle(95,70,20);
        ogrenci.gectiMi();
    }
}
