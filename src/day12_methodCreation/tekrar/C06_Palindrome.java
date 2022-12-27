package day12_methodCreation.tekrar;

import day12_methodCreation.C07_TerseCevirme;

public class C06_Palindrome {
    public static void main(String[] args) {

        // Verilen bir String'in palindrome olup olmadigini yazdirin
        // Palindrome : duz okunusu ile tersten okunusu birbirine ayni olan

        String str="123456";
        String tersStr= C07_TerseCevirme.metniTerseCevir(str);
        if (str.equals(tersStr)){
            System.out.println("verilen metin palindrome");
        }else{
            System.out.println("verilen metin palindrome degil");
        }

    }
}
