package day11_forLoops.day11_ornek;

public class C08_forloop {
    public static void main(String[] args) {

        //Soru 10 - Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.
String str="Java ogrenmek icin cok calismak gerekiyor";
String tersstr="";

        for (int i = str.length()-1 ; i >=0; i--) {
            tersstr+=str.substring(i,i+1);
        }

        System.out.println("Girilen cumlenin tersten yazilisi:"+tersstr);
    }
}
