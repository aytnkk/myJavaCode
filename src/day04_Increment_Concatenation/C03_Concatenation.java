package day04_Increment_Concatenation;

import java.security.spec.RSAOtherPrimeInfo;

public class C03_Concatenation {
    public static void main(String[] args) {


        int a=10;
        int b=20;
        String str1="";// hiclik
        String str2=" ";
        String str3="-";

        System.out.println(a+b);//30
        System.out.println(str1+a+b);// ""+10+20= "10" + 20 ="1020"

        System.out.println(a+str2+b);//10+" "+20= "10 " +20="10 20"
        System.out.println(a+b+str3);//10+20+"-" = 30+ "-" ="30-"
        System.out.println(str1+a*b);//""+10*20="200"
        System.out.println(str2+(a+b));//" " +(10+20)=" "+30=" 30"

        //System.out.println(str1*a);   carpi ve eksi uygulanamaz sadece toplama uygulanabilir






    }
}
