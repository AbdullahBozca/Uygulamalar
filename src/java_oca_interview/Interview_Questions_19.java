package java_oca_interview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Interview_Questions_19 {
    /*
           Char occurences in a String
          input : "aaabbccccddddd"
          output : a3b2c4d5

          verilen bir string'deki tekrarlayan character'leri ve tekrar sayisini yazdırınız.
         */
    public static void main(String[] args) {
        String input = "aaabbccccddddd";
        List<String> list = new ArrayList<String>(Arrays.asList(input.split("")));
        List<String> listTekrarsiz = new LinkedList<String>();
        

        System.out.println(listTekrarsiz);
        System.out.println(list);
        int sayac = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {

                if (list.get(i).contains(list.get(j)))
                    sayac++;
            }
            System.out.print(list.get(i) + "=" + sayac + " adet ");
            sayac = 0;
        }
    }
}
