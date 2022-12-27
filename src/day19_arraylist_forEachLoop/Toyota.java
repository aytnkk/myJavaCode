package day19_arraylist_forEachLoop;

public class Toyota {

    public String marka="Toyota";
    public String model="Model belirtilmemis";
    public int yil;
    public int km;
    public String renk;
   // default constructor suna benzer




    public Toyota(){
       System.out.println("Toyota class'indaki cons. calisti");


   }
    /*
        Bir kod blogunun constructor olup olmadigini anlamak icin
        2 seye bakmaliyiz
        1- Constructor class ismi ile ayni isimde olmalidir
        (dolayisiyla cons. isimleri buyuk harfle baslar)
        2- Constructor'larin return type'i olmaz
     */

    /*
    java'da her class obje uretmek uzere olusturulur
     bir obje olusturulup ilk deger atamasi yapilabilmesi icin de
     mutlaka constructor calismalidir.

     Java'da her classda mutlaka CONSTRUCTOR bulunur.
     Her class'ta bizim constructor olusturmamiza gerek kalmmasi icn
     java her class a otomatik olarak default constructor koyar.

     Default constuctor gorunmez.
    default constucter parametresi olmayan
    ve body'sinde hic kod bulunmayan bir constructor'dur.

    Bir class'da gozlerimizle bir constuctor gormuyorsak
    o class'da default constuctor vardir.
    eger kullnicilar tarafindan gozle gorunur bir
    consctuctor olusturulursa java default constructor'i siler
    yani gozlerimizle bir constructor goruyorsak
        o class'da default constructor YOKTUR

     */

    }

