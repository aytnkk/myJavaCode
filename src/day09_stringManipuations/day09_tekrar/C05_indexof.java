package day09_stringManipuations.day09_tekrar;

public class C05_indexof {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";

        // str "cok" iceriyor mu
        System.out.println(str.contains("cok"));//  true


        System.out.println(str.endsWith("cok"));// false
        System.out.println(str.indexOf('a'));//1
        System.out.println(str.indexOf("v"));//2
        System.out.println(str.indexOf("cok"));//17
        System.out.println(str.indexOf("a",5));//13



        // Java ile kodlama cok kolay

        // 2.o'nun index'ini yazdirin
        // once ilk o'nun index'ini buluruz
        // sonra o index'den sonrasinda 2. o'yu aratiriz

       int ilkIndexOf=str.indexOf("o");//10
        int ikinciIndexOf=str.indexOf("o",ilkIndexOf+1);
        System.out.println(ilkIndexOf+ " " +ikinciIndexOf);



    }
}
