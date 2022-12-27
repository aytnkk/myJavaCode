package day15_Scope_arrays.tekrar;

import day15_Scope_arrays.C01_Hastane;

public class C03_baskaClassaErisme {
    public static void main(String[] args) {

        System.out.println(C01_Hastane.hastaneAdres);// Cankaya/Ankara
        C01_Hastane.method1();//  Cankaya/Ankara

        System.out.println(C01_Hastane.hastaneismi);// Yildiz Hastanesi

        C01_Hastane per1=new C01_Hastane();

        System.out.println(per1.personelAdresi);// null
        System.out.println(per1.hastaneismi);// Yildiz


        per1.personelIsmi="Belkis";
        per1.personelAdresi="Istanbul";
        per1.hastaneAdres="Uskudar";

        System.out.println(per1.personelIsmi);//Beklis
        System.out.println(per1.personelAdresi); // Istanbul
        System.out.println(per1.personelTel); // null
        System.out.println(per1.hastaneismi); // Yildiz
        System.out.println(per1.hastaneAdres); // Uskudar




    }
}
