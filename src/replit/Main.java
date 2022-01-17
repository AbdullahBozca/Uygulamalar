package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static String kelime1;
    static String kelime2;
    static int uzunluk;

    public static void main(String[] args) {
        String alfabe = "ABCDEFGHIJKLMNOPRSTUVQWXYZabcdefghijklmnopqrstuvwxyz";
        System.out.println("Oyuncu1 Kelime Gir");
        kelime1 = scan.next();
            if(kelime1.length()<2) {

                uzunluk = kelime1.length();
                for (int i = 0; i < alfabe.length(); i++) {
                    if (kelime1.contains(alfabe.substring(i, i + 1))) {
                        System.out.println("Calistinmi");
                    } else {
                        System.out.println("Alfabeden Giris Yap");
                        break;
                    }
                }

            }else{
                System.out.println("Yanlis Giris" );
            }
            //System.out.println("Oyuncu2 Kelime Gir");
            // kelime2 = scan.next();
            //uzunluk<2||


    }
}

