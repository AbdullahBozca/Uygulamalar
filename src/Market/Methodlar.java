package Market;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Methodlar {
    static int urunlerId = 0;
    static Map<Integer, String> urunlerMap = new HashMap<Integer, String>();
    static Scanner scanner =new Scanner(System.in);
    public static void urunListesi() {
        urunlerMap.put(++urunlerId, "Domates,2.10");
        urunlerMap.put(++urunlerId, "Patates,3.20");
        urunlerMap.put(++urunlerId, "Biber,1.50");
        urunlerMap.put(++urunlerId, "Soğan,2.30");
        urunlerMap.put(++urunlerId, "Havuç,3.10");
        urunlerMap.put(++urunlerId, "Elma,1.20");
        urunlerMap.put(++urunlerId, "Muz,1.90");
        urunlerMap.put(++urunlerId, "Çilek,6.10");
        urunlerMap.put(++urunlerId, "Kavun,4.30");
        urunlerMap.put(++urunlerId, "Üzüm,2.70");
        urunlerMap.put(++urunlerId, "Limon,0.50");


    }

    public static void menu(){
        System.out.println("==========FALAN FİLAN MANAVA HOŞGELDİNİZ==========\n" +
                "1-Ürün listesi\n" +
                "2-Alışveriş\n" +
                "3-Ödeme\n" +
                "4-Çıkış");

        int secim=scanner.nextInt();
        switch(secim) {
            case 1:
                System.out.println("==========Ürün listesi==========");
                urunListesi();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }

    }


    public static void urunSil(int urunlerId){

    }


}
