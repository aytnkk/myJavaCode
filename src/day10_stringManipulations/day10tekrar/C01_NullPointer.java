package day10_stringManipulations.day10tekrar;

public class C01_NullPointer {
    public static void main(String[] args) {



        String str1="";
        String str2="   ";
        String str3;
        String str4=null;

        System.out.println(str1.length());//0
        System.out.println(str2.length());//4

        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());// false

        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true

        /*null bir deger degil ,isaretcidir(null pointer)
        null pointer : non primitive bir objenin olusturuldugunu
        ancak bilincli olarak deger atanmadigini isaretler.
        str4 un degeri null'dur cumlesi YANLIS
        str4 null olarak isaretlenmistir cumlesi DOGRU

         */

        // System.out.println(str3.length());

        // System.out.println(str3.concat("Ali can"));
        // System.out.println(str3.substring(3,4));
       /*
       java bir variable'yi olusturup deger atanmamasina izin verir
       bir variableyi deger atamadan olusturabilirsiniz anvak kullanamazsiniz
       deger atanmayan bir variabbleyi kullanmaya kalkarsaniz java cte verir

       null pointer ise bu variable'ye bir deger atanmadigini ve bunun bilincli bir
       tercih oldugunu java'ya soyler
       dolayisiyla java kodlarin calismaya devam etmesine iziin verir
       ancakk deger atanmadigi icin methodlarla kullanmaya calsiirsaniz hata verir
        */

        str4=null;
        // System.out.println(str4.length());// nullpointerException
        // System.out.println(str4.substring(3,4));// calistirinca hata verir
        System.out.println(str4);//null
        System.out.println(str4 + " Ali can");// nullAlican
        System.out.println(str4.concat("Ali can"));//nullAli can


    }
}
