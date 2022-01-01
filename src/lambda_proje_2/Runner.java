package lambda_proje_2;

import lambda_proje.Ogrenci;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    //bir ogrenci listesi olusturun
    //ad soyad yas diplomaNotu cinsiyet
    //toString methodu ile ogrenci bilgilerin yazdirin
    //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
    //Öğrencileri yaşlarına göre sıralayark yazdırin
    //Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
    //Öğrencileri isimlerine göre yazdırın
    //Öğrencileri soyisimlerine göre yazdır,n
    //Öğrencileri cinsiyetlerine göre yazdıran
    //reduce metoduyla ortalama hesaplayin
    // Girilen ogrenci ismini sil
    //Test amaçlı Öğrenci nesneleri oluşturun.


    public static List<Ogr> ogrListesi = new ArrayList<Ogr>();

   public static void main(String[] args) {
      testOgrenciOlustur();
      //Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin
      altUstLim(3,6);
      //Öğrencileri yaşlarına göre sıralayark yazdırin
      yasaGoreSirala();
      //Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin
      yasaVeCinsiyeteGoreSirala(15,"erkek");
      //Öğrencileri isimlerine göre yazdırın
      ismeGoreListele("Ahmet");
      //reduce metoduyla ortalama hesaplayin
      ortalama();

   }

   private static void ortalama() {
      DoubleSummaryStatistics istatistik=ogrListesi.
              stream().
              mapToDouble(Ogr::getDiplomaNotu).
              summaryStatistics();
      System.out.println("========= SINIF DİPLOMA NOT İSTATİSTİKLERİ ===========");
      System.out.println("SINIF ORTALAMASI:"+ istatistik.getAverage());
      System.out.println("KİŞİ SAYISI:"+ istatistik.getCount());
      System.out.println("MAKS ORTALAMA:"+ istatistik.getMax());
      System.out.println("MİN ORTALAMA:"+ istatistik.getMin());

   }

   private static void ismeGoreListele(String ahmet) {
      System.out.println("Öğrencileri isimlerine göre yazdırın");
      System.out.println(ogrListesi.
              stream().
              filter(t -> t.getAd().equalsIgnoreCase(ahmet)).
              collect(Collectors.toList()));
   }

   private static void yasaVeCinsiyeteGoreSirala(int i, String erkek) {
      System.out.println("Öğrencileri belirli bir yaşa ve cinsiyete göre sıralayarak listeleyin");
      System.out.println(ogrListesi.
              stream().
              filter(t -> t.getCinsiyet().equalsIgnoreCase("erkek")).
              filter(t -> t.getYas() == i).
              collect(Collectors.toList()));

   }

   private static void yasaGoreSirala() {
      System.out.println("Öğrencileri yaşlarına göre sıralayark yazdırin");
      ogrListesi.
              stream().
              sorted(Comparator.comparing(Ogr::getYas)).
              forEach(System.out::println);
   }

   private static void altUstLim(int a,int b) {
      System.out.println("Öğrenci notlarını alt ve üst limitlere göre sıralayarak  yazdirin");
      ogrListesi.
              stream().
              sorted(Comparator.comparing(Ogr::getDiplomaNotu).reversed()).
              skip(a-1).
              limit(b-a+1).
              forEach(System.out::println);

   }

   //Test amaçlı Öğrenci nesneleri oluşturur.
   private static void testOgrenciOlustur() {
      ogrListesi.add(new Ogr("Ahmet", "Can", 30, 95.5, "erkek"));
      ogrListesi.add(new Ogr("Ahmet", "Baki", 18, 90.1, "erkek"));
      ogrListesi.add(new Ogr("Ayşe", "Can", 21, 82.3, "kadın"));
      ogrListesi.add(new Ogr("Mustafa", "Can", 15, 75.4, "erkek"));
      ogrListesi.add(new Ogr("Ayşe", "Yılmaz", 40, 45, "kadın"));
      ogrListesi.add(new Ogr("Ali", "Veli", 80, 35.5, "erkek"));
      ogrListesi.add(new Ogr("Veli", "Öztürk", 20, 95.5, "erkek"));
      ogrListesi.add(new Ogr("Selim", "Yaş", 21, 95.5, "erkek"));
   }
}
