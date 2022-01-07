package galeri_otomasyonu;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Islemler {

static DenemeAracVeri arac = new DenemeAracVeri();
 public static void odeme() {
  System.out.println("Galerideki Mevcut Araclarimiz");
  arac.aracListesi();
  Scanner scan = new Scanner(System.in);
  int secim;
  do{
   System.out.println("Secmek istediginiz Arac Noyu(10,11,12,13,14) Giriniz");
   secim = scan.nextInt();

  }while (!arac.aracMap.containsKey(secim));

  System.out.println("sectigin arac : " + arac.araclar(secim));

 }
}
 /*
  System.out.println("Galerideki Mevcut Araclarimiz");
        Scanner scan = new Scanner(System.in);
        System.out.println("Secmek istediginiz Arac Noyu Giriniz");
        secim = scan.nextInt();
        while (!arac.aracMap.containsKey(secim)) {
            secim = scan.nextInt();
            System.out.println("agam sectigin arac bizde yok 10-13 arasi gir");
        }
        System.out.println("sectigin arac : " + arac.araclar(secim));
   */
  /*
   System.out.println("Galerideki Mevcut Araclarimiz");
  arac.aracListesi();
  Scanner scan = new Scanner(System.in);
  do {
   System.out.println("Secmek istediginiz Arac Noyu Giriniz");
   secim = scan.nextInt();
   arac.araclar(secim);

  } while (secim!=10&&secim!=11&&secim!=12&&secim!=13&&secim!=14);
   */