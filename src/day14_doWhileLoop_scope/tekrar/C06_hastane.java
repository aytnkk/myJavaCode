package day14_doWhileLoop_scope.tekrar;

public class C06_hastane {

    static String hastaneIsmi="Yildiz hastanesi";
    static String hastaneAdresi="Cankaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personelTel;


    public static void main(String[] args) {

        Hastane p1=new Hastane();
        p1.personelIsmi="kemal";

        C06_hastane p3= new C06_hastane();
        p3.personelTel="1234566";

    }
}
