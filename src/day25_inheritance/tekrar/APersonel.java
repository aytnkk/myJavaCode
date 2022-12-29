package day25_inheritance.tekrar;

public class APersonel {

    public String isim = "Isim atanmadi";
    protected String soyIsim = "Soyisim atanmadi";
    protected String telefon = "Telefon atanmadi";

    public void maas() {
        System.out.println("Hastanemizde uygulanan asgari ucret:" + 1700);
    }

    protected void ozelSigorta() {
        System.out.println("Tum personelin ozel saglik sigortasi yaptirilir");
    }

    private void privateMethod() {
        System.out.println("private Method");
    }
}