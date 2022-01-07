package galeri_otomasyonu;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DenemeAracVeri {

static   Map<Integer,Map<String,String>> aracMap = new TreeMap<>();

 public Map<String, String> araclar(int no){
Map<String,String> arac1 = new TreeMap<>();
     arac1.put("AModel","Yaris");
     arac1.put("BSize","Hatchback");
     arac1.put("CMotor","Hybrit");
     arac1.put("DMotorGucu","1.4");
     arac1.put("EKilometre","40000");
     arac1.put("Fiyat","150000");
     Map<String,String> arac2 = new TreeMap<>();
     arac2.put("AModel","Rav4");
     arac2.put("BSize","Jeep");
     arac2.put("CMotor","Hybrit");
     arac2.put("DMotorGucu","2.0");
     arac2.put("EKilometre","50000");
      arac2.put("Fiyat","800000");
     Map<String,String> arac3 = new TreeMap<>();
     arac3.put("AModel","Corolla");
     arac3.put("BSize","Binek");
     arac3.put("CMotor","Hybrit");
     arac3.put("DMotorGucu","1.6");
     arac3.put("EKilometre","60000");
     arac3.put("Fiyat","140000");
     Map<String,String> arac4 = new TreeMap<>();
     arac4.put("AModel","Lan_Cruiser");
     arac4.put("BSize","Jeep");
     arac4.put("CMotor","Duz");
     arac4.put("DMotorGucu","2.5");
     arac4.put("EKilometre","60000");
     arac4.put("Fiyat","800000");
     Map<String,String> arac5 = new TreeMap<>();
     arac5.put("AModel","Jazz");
     arac5.put("BSize","Hatcback");
     arac5.put("CMotor","Duz");
     arac5.put("DMotorGucu","1.6");
     arac5.put("EKilometre","170000");
     arac5.put("Fiyat","110000");

aracMap.put(10,arac1);
aracMap.put(11,arac2);
aracMap.put(12,arac3);
aracMap.put(13,arac4);
aracMap.put(14,arac5);
/*
      Set<Map.Entry<Integer,Map<String,String>>> entrySet=aracMap.entrySet();
      for (Map.Entry<Integer,Map<String,String>> each:entrySet ){
           System.out.println(each+" ");// Aradan Yuzyil sonra alt alta yazdirdik
      }
*/


      return aracMap.get(no);
 }
public  void aracListesi(){
     Map<String,String> arac1 = new TreeMap<>();
     arac1.put("AModel","Yaris");
     arac1.put("BSize","Hatchback");
     arac1.put("CMotor","Hybrit");
     arac1.put("DMotorGucu","1.4");
     arac1.put("EKilometre","40000");
     arac1.put("Fiyat","150000");
     Map<String,String> arac2 = new TreeMap<>();
     arac2.put("AModel","Rav4");
     arac2.put("BSize","Jeep");
     arac2.put("CMotor","Hybrit");
     arac2.put("DMotorGucu","2.0");
     arac2.put("EKilometre","50000");
     arac2.put("Fiyat","800000");
     Map<String,String> arac3 = new TreeMap<>();
     arac3.put("AModel","Corolla");
     arac3.put("BSize","Binek");
     arac3.put("CMotor","Hybrit");
     arac3.put("DMotorGucu","1.6");
     arac3.put("EKilometre","60000");
     arac3.put("Fiyat","140000");
     Map<String,String> arac4 = new TreeMap<>();
     arac4.put("AModel","Land_Cruiser");
     arac4.put("BSize","Jeep");
     arac4.put("CMotor","Duz");
     arac4.put("DMotorGucu","2.5");
     arac4.put("EKilometre","60000");
     arac4.put("Fiyat","800000");
     Map<String,String> arac5 = new TreeMap<>();
     arac5.put("AModel","Jazz");
     arac5.put("BSize","Hatcback");
     arac5.put("CMotor","Duz");
     arac5.put("DMotorGucu","1.6");
     arac5.put("EKilometre","170000");
     arac5.put("Fiyat","110000");

     aracMap.put(10,arac1);
     aracMap.put(11,arac2);
     aracMap.put(12,arac3);
     aracMap.put(13,arac4);
     aracMap.put(14,arac5);

     Set<Map.Entry<Integer,Map<String,String>>> entrySet=aracMap.entrySet();
     for (Map.Entry<Integer,Map<String,String>> each:entrySet ){
          System.out.println(each.getKey()+". araç= "+each.getValue());// Aradan Yuzyil sonra alt alta yazdirdik
     }


}

}
//  Set<Entry<Integer, String>> entrySet =ornek.entrySet();	//her bir eleman entry 101=Ali, Can, java gibi...
//    int sayac=1;
//    for (Entry<Integer, String> each : entrySet) {
//        System.out.println(sayac+".entry : "+each);
//        sayac++;
//    }

/*
 (10,"Yaris,Hatchback,Hybrit,1.4,40.000");
aracOzellikMap.put(11,"Rav4,Jeep,Hybrit,2.0,50.000") ;
aracOzellikMap.put(12,"Corolla,Binek,Duz,1.6,120.000") ;
aracOzellikMap.put(13,"City,Binek,Duz,1.5,75000") ;
aracOzellikMap.put(14,"Lan_Cruiser,Jeep,Duz,2.5,150.000") ;
/*


//Map<Map<String,String>,Integer> aracFiyatMap = new HashMap<>();
// Model=Yaris=(Unigue) Size=Hatcback,Motor=Hybrit MotorGucu=1.4
//Km=50000 Fiyat= 120000
     //System.out.println(aracOzellikMap.get("Yaris"));

     Map<String,Double> aracFiyatiMap = new HashMap<String,Double>();
     aracFiyatiMap.put(aracOzellikMap.get(10),120.999);
     aracFiyatiMap.put(aracOzellikMap.get(11),500.999);
     aracFiyatiMap.put(aracOzellikMap.get(12),200.999);
     aracFiyatiMap.put(aracOzellikMap.get(13),130.999);
     aracFiyatiMap.put(aracOzellikMap.get(14),999.999);
     System.out.println(aracFiyatiMap);
       //kullaniciya aracOzellik.get(Key)
*/
