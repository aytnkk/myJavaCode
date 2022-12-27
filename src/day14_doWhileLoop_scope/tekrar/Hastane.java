package day14_doWhileLoop_scope.tekrar;

import day14_doWhileLoop_scope.C06_Hastane;

public class Hastane {
    static String hastaneismi = "Yildiz Hastanesi";
    static String hastaneAdres = "Cankaya/Ankara";
    String personelIsmi;
    String personelAdresi;
    String personelTel;

    public static void main(String[] args) {
        C06_Hastane p1 = new C06_Hastane();
        p1.personelIsmi = "Kemal";
        C06_Hastane p3 = new C06_Hastane();
        p3.personelTel = "3121232323";

    }
}