package day15_Scope_arrays.tekrar;

public class C02_hastane {

   static String hastaneIsmi="Yildiz Hastanesi";
   static String hastaneAdresi="Cankaya/Ankara";

   String personelIsmi="personel";
   String personelAdresi="Adres";
   String personelTel="Tel";


   public static void main(String[] args) {

       C02_hastane per1=new C02_hastane();
       C02_hastane per2=new C02_hastane();

       per1.personelIsmi="Harun";
       per2.personelAdresi="Cankaya";

       per1.hastaneIsmi="Java Hastanesi";

       System.out.println(per1.personelTel);// Telefon
       System.out.println(per1.personelIsmi);//Harun
       System.out.println(per2.personelIsmi);//personel
       System.out.println(per2.personelAdresi); // cankaya
       System.out.println(per1.hastaneIsmi);// Java Hastanesi
       System.out.println(per2.hastaneIsmi);// Java Hastanesi
        // hastane ismi herkesi ilgilendirdigi icin degisince herkes icin degisir

       per1.personelIsmi="Mehmet";
       System.out.println(per1.personelIsmi);// Mehmet
       System.out.println(per2.personelIsmi);//personel




    }
}
