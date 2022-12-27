package day00_JavaPractice.day01;

public class Ders02 {
    public static void main(String[] args) {

        // byte,short,integer,long,double, float veri tiplerinin max vve min degerlerini yazdiralim

        int intMax=Integer.MAX_VALUE;
        int intMin=Integer.MIN_VALUE;

        System.out.println("intMin = " + intMin);
        System.out.println("intMax = " + intMax);


        byte byteMax=Byte.MAX_VALUE;
        byte byteMin=Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax);
        System.out.println("byteMin = " + byteMin);

        short shortMax=Short.MAX_VALUE;
        short shortMin=Short.MIN_VALUE;

        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);

        double dblMax=Double.MAX_VALUE;
        double dblMin=Double.MIN_VALUE;
        System.out.println("dblMax = " + dblMax);
        System.out.println("dblMin = " + dblMin);

        float fltMax=Float.MAX_VALUE;
        float fltMin=Float.MIN_VALUE;

        System.out.println("fltMax = " + fltMax);
        System.out.println("fltMin = " + fltMin);

        long lgnMax=Long.MAX_VALUE;
        long lgnMin=Long.MIN_VALUE;

        System.out.println("lgnMax = " + lgnMax);
        System.out.println("lgnMin = " + lgnMin);

        // Her veri turuyle bir tane olmk uzere 4 degisken olusturun(float , double, char, boolean )
        // Degiskenler icin anlamli isimler kullanip yazdiralim

        System.out.println("");

        float laptopFiyat= 900.99f;
        double kilometre=34.56;
        char harf='a';
        boolean guzelMi=true;

        System.out.println("guzelMi = " + guzelMi);
        System.out.println("laptopFiyat = " + laptopFiyat);
        System.out.println("harf = " + harf);
        System.out.println("kilometre = " + kilometre);



    }
}
