package day25_inheritance;

public class APersonel {

   public String isim="Isim atanmadi";
   public String soyIsim="Soyisim atanmadi";
   public String telefon="Telefon atanmadi";

public void maas(){
    System.out.println("Hastanemizde uygulanan asgari ucret:" +1700);
}
public void ozelSigorta(){
    System.out.println("Tum personelin ozel saglik sigortasi yaptirilir");
}
private void privateMethod(){
    System.out.println("private Method");
}

}
