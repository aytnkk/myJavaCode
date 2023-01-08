package day11_forLoops;

public class C07_forLoop {
    public static void main(String[] args) {

        //Soru 10 - Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.


        String str="Java ogrenmek icin cok calismak gerekiyor";
        String tersStr="";

        for (int i=str.length()-1; i >=0 ; i--) {
         tersStr+= str.substring(i,i+1);


        }
        System.out.println("Girilen cumlenin tersten yazilisi:"+tersStr);
    }
}
