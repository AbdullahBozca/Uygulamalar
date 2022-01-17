package java_oca_interview;

import java.util.Scanner;

public class Interview_Questions_17 {
   /*
  Ask user to enter the number of lines of a inverted half pyramid .
  Type a program to create the inverted half pyramid.
  For example if the number of lines is 5, the pyramid will be like;

  * * * * *
  * * * *
  * * *
  * *
  *

  Kullanıcının  girdigi satır sayısı kadar * ile ters yarım piramid sekli yazdıran bir program create ediniz.

  */
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int satir=scanner.nextInt();

       for(int i=satir ; i>0 ;i--){
           for(int j=1;j<=i; j++){
               System.out.print("*");
           }
           System.out.println();
       }
   }
}
