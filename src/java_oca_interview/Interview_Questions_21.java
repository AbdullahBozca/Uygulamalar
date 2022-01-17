package java_oca_interview;

import java.util.Scanner;

public class Interview_Questions_21 {
    /*
         Ask user to enter the number of lines of a inverted  .
         Type a program to create the inverted  pyramid.
         For example; if the number of lines is 5, the pyramid will be like;

         * * * *  * * * *
           * * * * * *
             * * * *
               * *
                *

         Kullanıcının  girdigi satır sayısı kadar * ile  ters  piramid sekli yazdıran bir program create ediniz.

         */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Satır sayısı gir : ");
        int satir = scanner.nextInt();
        for (int i = 0; i<satir;i++){
            for (int j = i; j <satir;j++)
                System.out.print(" ");
                for (int k = (satir-1)*2; k > 0;k--) {
                    System.out.print("* ");
                }

            System.out.println();
        }

    }
}
