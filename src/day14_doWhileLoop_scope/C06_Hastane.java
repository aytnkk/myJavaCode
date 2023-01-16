package day14_doWhileLoop_scope;
public class C06_Hastane {

    static String hastaneismi="Yildiz Hastanesi";
    static String hastaneAdres="Cankaya/Ankara";
    public String personelIsmi;
    String personelAdresi;
    public String personelTel;
    public static void main(String[] args) {
        C06_Hastane p1= new C06_Hastane();
        p1.personelIsmi="Kemal";
        C06_Hastane p3= new C06_Hastane();
        p3.personelTel="3121232323";
    }
}