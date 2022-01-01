package lambda_proje;

public class Ogrenci {
    //bir ogrenci listesi olusturun
    //ad soyad yas diplomaNotu cinsiyet
    //toString methodu ile ogrenci bilgilerin yazdirin
    //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
    //Öğrencileri yaşlarına göre sıralayark yazdırin
    //Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
    //Öğrencileri isimlerine göre yazdırın
    //Öğrencileri soyisimlerine göre yazdır,n
    //Öğrencileri cinsiyetlerine göre yazdıran
    //listeyi yazdırırken içinde veri var mı diye kontrol edin
    //reduce metoduyla ortalama hesaplayin
    // Girilen ogrenci ismini sil
    //Test amaçlı Öğrenci nesneleri oluşturun.

    private String ad;
    private String soyAd;
    private int yas;
    private double diplomaNotu;
    private String cinsiyet;

    public Ogrenci(String ad, String soyAd, int yas, double diplomaNotu, String cinsiyet) {
        this.ad = ad;
        this.soyAd = soyAd;
        this.yas = yas;
        this.diplomaNotu = diplomaNotu;
        this.cinsiyet = cinsiyet;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getDiplomaNotu() {
        return diplomaNotu;
    }

    public void setDiplomaNotu(double diplomaNotu) {
        this.diplomaNotu = diplomaNotu;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", soy ad='" + soyAd + '\'' +
                ", yaş=" + yas +
                ", diploma Notu=" + diplomaNotu +
                ", cinsiyet='" + cinsiyet + '\'';
    }
}
