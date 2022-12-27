package day15_Scope_arrays;

public class C02_Hastane {
    static String hastaneismi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";

    String personelIsmi="personel";
    String personelAdresi="Adres";
    String personelTel="Telefon";


    public static void main(String[] args) {

        C02_Hastane per1=new C02_Hastane();


        C02_Hastane per2=new C02_Hastane();

        per1.personelIsmi="Harun";
        per2.personelAdresi="Cankaya";

        per1.hastaneismi="Java Hastanesi";

        System.out.println(per1.personelTel);//Telefon
        System.out.println(per1.personelIsmi);// Harun
        System.out.println(per2.personelIsmi);//Personel
        System.out.println(per2.personelAdresi);// Cankaya
        System.out.println(per1.hastaneismi);// Java Hastanesi
        System.out.println(per2.hastaneismi);// Java Hastanesi
        System.out.println(hastaneismi);// Java Hastanesi


        per1.personelIsmi="Mehmet";
        System.out.println(per1.personelIsmi);// Mehmet

        System.out.println(per2.personelIsmi);// Personel


    }
}
