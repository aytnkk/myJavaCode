package day15_Scope_arrays;
public class C01_Hastane {
    public static String hastaneismi="Yildiz Hastanesi";
    public static String hastaneAdres="Cankaya/Ankara";
    public String personelIsmi;
    public String personelAdresi;
    public String personelTel;
    public static void main(String[] args) {
        /*
           Eger tum method'lardan kullanilabilecek variable'lar olusturmak isterseniz
           bu variable'lari class level'da olustururuz
           Class level'da olusturulacak variable'lar icin 2 ihtimal vardir
           1- static variable (Class variable)
           2- instance(static olmayan) variable ( obje variable)
           Kural1- static variable'lar tum objeler icin tek bir deger alir
                   instance variable'lar her obje icin java tarafindan cogaltilir

           Kural2-class level variable'lara deger atamasak da kullanabiliriz
                  biz deger atamasakl bile java class level variable'lara default degerler atar
                  non-primitive ==> null (String)
                  sayisal primitive ==> 0
                  char ==> hiclik ''
                  boolean ==> false

                  kural 3- static olan method'lardan static olmayan variable ve methodlara direk ulasilamaz
                  instance variable ve static olmayan methodlari static olanlardan kullanmak isterseniz
                  obje uzerinden kullanabilirsiniz.

                  kural 4- classta olusturulan instance variablleler  ilk deger atamasini yapar.
                  yani bir obje ilk olusturuldugunda otomatik olarak instance variable'a atanan degeri alir.
                  deger atanmamissa default degerleri alir.
                  obje olusturulduktan sonra obje uzerinden yapilan atamalar class leveldaki
                  instance variableye degil, java tarafindan olusturulup
                    objeye yapistirilan kopya variable'a yapilir
         Kural5- static variable'lar tum objeler icin ortaktir.
                 static variable'lara tum class'dan direk ulasilabilir
                 static variable'in degeri degisirse tum objeler icin degismis olur


         */

        C01_Hastane per1= new C01_Hastane();
        System.out.println(per1.personelIsmi); // null
        System.out.println(per1.personelAdresi);//null;
        System.out.println(per1.personelTel);//null

        //System.out.println(personelIsmi);
        per1.personelIsmi="fidan";
        per1.personelAdresi="germany";
        per1.personelTel="+497654323556";

        C01_Hastane per2=new C01_Hastane();
        System.out.println(per2.personelIsmi);

        per1.personelIsmi="yusuf";
        System.out.println(per2.personelIsmi);// null
        per2.personelIsmi="Ayten";
        System.out.println(per2.personelIsmi);//Ayten
        System.out.println(per1.personelIsmi);//Yusuf

        System.out.println(hastaneismi);// yildiz Hastanesi

        System.out.println(per1.hastaneismi);// Yildiz Hastanesi

        per2.hastaneismi="Java Hastanesi";
        System.out.println(hastaneismi);// Java Hastanesi
        System.out.println(per1.hastaneismi);//Java Hastanesi
        System.out.println(per2.hastaneismi);//Java Hastanesi

    }
    public static  void  method1(){
        System.out.println(hastaneAdres);
    }
    public void method2(){
        System.out.println(hastaneismi);
    }
}
