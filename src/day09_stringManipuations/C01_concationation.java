package day09_stringManipuations;

public class C01_concationation {
    public static void main(String[] args) {

        String str1="Java";
        String str2="candir";

        System.out.println(str1+""+str2);// java candir

        System.out.println(str1.concat(str2));//javacandir

        System.out.println(str2.concat("").concat(str2));


    }
}
