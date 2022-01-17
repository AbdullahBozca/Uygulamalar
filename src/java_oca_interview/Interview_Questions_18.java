package java_oca_interview;

import java.util.Scanner;

public class Interview_Questions_18 {
/*
 Ask user to enter the number of lines of a  pyramid .
 Type a program to create the pyramid.
 For example if the number of lines is 5, the pyramid will be like;
             *
            * *
           * * *
          * * * *
         * * * * *


 Kullanıcının  girdigi satır sayısı kadar * ile piramid sekli yazdıran bir program create ediniz.

 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int satir= scanner.nextInt();

        for (int i = 1; i < satir; i++)
        {
            for (int bosluk =satir; bosluk > i ; bosluk--)
            {
                System.out.print(" ");
            }

            for (int yildiz = 0; yildiz < (i*2)-1; yildiz++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        }


    }



