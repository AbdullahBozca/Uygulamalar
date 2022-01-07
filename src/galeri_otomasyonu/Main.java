package galeri_otomasyonu;

import java.util.Scanner;

public class Main {
    static DenemeAracVeri calis = new DenemeAracVeri();
    public static void main(String[] args) {

        galeriMenu();


    }
    public static void galeriMenu() {

        System.out.println("Toyota Galeriye Hosgeldiniz");
        System.out.println("1==>Arac Listesi\n2==>Satin Alma\n3==>Cikis");
        Scanner scan = new Scanner(System.in);
        int tercih = scan.nextInt();

        switch (tercih){
            case 1:
                calis.aracListesi();
                galeriMenu();
            break;
            case 2:
              Islemler islemler = new Islemler();
              Islemler.odeme();

                break;
            case 3:
               System.exit(0);
                break;
            default :{
                System.out.println("Hatali Giris Yaptiniz");
            }
        }



    }
}
