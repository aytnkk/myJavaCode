package day02_variables_scanner;

public class C03_NonPrimitiveDataTypes {
    public static void main(String[] args) {



        String str="Java candir";
        int sayi=10;

        /*
        primitive data turlerinin hazir methhodlari yoktur
         ancak non primitive data turlerinin onceden hazirlanmis ,
        bizim kullanabilcegimiz methodlari olur

         */


        System.out.println(sayi);//10

        System.out.println(str.toLowerCase());//java candir  kucuk harfle yazar
        System.out.println(str);//Java candir

        System.out.println(str.toUpperCase());//JAVA CANDIR
        System.out.println(str);//Java candir


        System.out.println(str.isEmpty());//false



    }
}
