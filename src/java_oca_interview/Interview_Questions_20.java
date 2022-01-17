package java_oca_interview;

import java.util.Arrays;

public class Interview_Questions_20 {
    /*

        We are organizing a horse race with horses having distinct strengths.
        The strength of the horses is represented by an array of integers.
        In order to make the race competitive,  your program should find out the pair of
        horses with similar str
        Farklı güçleri olan atlarla bir at yarışı düzenliyor. Atların gücü bir tamsayı dizi assign  edilirse.
        bir birine yakın güçlere sahip at çiftlerini bulunuz.
        For example :{3, 67, 9, 46, 55, 48}
        output : 46,48

         */
    public static void main(String[] args) {


        int arr[] = {3, 67, 9, 2, 46, 55, 1};
        int arr2[] = new int[2];
        int fark = 0;
        int enYakin = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                fark = arr[i + 1] - arr[i];
                if (fark < enYakin) {
                    enYakin = fark;
                    arr2[0] = arr[i];
                    arr2[1] = arr[i + 1];
                }
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
