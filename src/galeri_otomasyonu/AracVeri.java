package galeri_otomasyonu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AracVeri {
  // elimizde 20 tane arac olsun


  public ArrayList<String> aracListe(int aracKey){

   Map<Integer,ArrayList<String>> mapArac=new HashMap<>();
      ArrayList<String> toyota_Yaris=new ArrayList<String>();
      //Toyota bayii gibide dusunulebilir 2 .el ve sifir olarak
      //Model ,
      // (Binekmi,HatchBack,Station),
      // Motor (Hybrit mi Duzmi)
      //Motor Gucu=1.0,1.4,1,6,1.8,2.0,2.5
      //Renk  BU LISTE UZATILABILIR
      toyota_Yaris.add("Model=Yaris");
      toyota_Yaris.add("Size=HatchBack");
      toyota_Yaris.add("Motor=Hybrit");
      toyota_Yaris.add("Motor Gucu=1.4");
      toyota_Yaris.add("Beyaz");
      toyota_Yaris.add("Km=50000");
      mapArac.put(1,toyota_Yaris);
      /*
   //****************************************
      ArrayList<String> toyota_Corolla=new ArrayList<String>();
      toyota_Yaris.add("Model=Corolla");
      toyota_Yaris.add("Size=Binek");
      toyota_Yaris.add("Motor=Hybrit");
      toyota_Yaris.add("Motor Gucu=1.6");
      toyota_Yaris.add("Beyaz");
      toyota_Yaris.add("Km=30000");
      mapArac.put(2,toyota_Corolla);
      //*****************************************
      ArrayList<String> toyota_Land_Cruiser=new ArrayList<String>();
      toyota_Yaris.add("Model=Land Cruiser");
      toyota_Yaris.add("Size=Jeep");
      toyota_Yaris.add("Motor=Duz");
      toyota_Yaris.add("Motor Gucu=2.0");
      toyota_Yaris.add("Gri");
      toyota_Yaris.add("Km=70000");
      mapArac.put(3,toyota_Land_Cruiser);
      //*****************************************
      ArrayList<String> toyota_Rav4=new ArrayList<String>();
      toyota_Yaris.add("Model=Rav4");
      toyota_Yaris.add("Size=Jeep");
      toyota_Yaris.add("Motor=Hybrit");
      toyota_Yaris.add("Motor Gucu=2.5");
      toyota_Yaris.add("Gri");
      toyota_Yaris.add("Km=70000");
      mapArac.put(4,toyota_Rav4);
      //**************************************
      ArrayList<String> toyota_City=new ArrayList<String>();
      toyota_Yaris.add("Model=City");
      toyota_Yaris.add("Size=Binek");
      toyota_Yaris.add("Motor=Duz");
      toyota_Yaris.add("Motor Gucu=1.8");
      toyota_Yaris.add("Bronz");
      toyota_Yaris.add("Km=80000");
      mapArac.put(5,toyota_City);



       */
      return mapArac.get(aracKey);
  }



}
