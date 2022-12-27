package day10_stringManipulations.day10tekrar;

public class C14_forloop_soru {
    public static void main(String[] args) {

        // kullanncidan 20'den kucuk bir sayi alip ,bu sayinin faktoriyel degerini hesaplayin


        int sayi=12;
        int carpim=1;

        for (int i =sayi; i >=1 ; i--) {
            carpim*=i;

        }
        System.out.println("verilen " + sayi + " sayisinin faktoriyeli:" + carpim);
    }
}
