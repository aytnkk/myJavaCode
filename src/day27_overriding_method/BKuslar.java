package day27_overriding_method;

public class BKuslar extends AHayvanlar{

    protected void kanat( ) {
        System.out.println("kanatlidirlar");
    }
    public void solunum() {
        System.out.println("akcigerle nefes alirlar");
    }
    protected void gaga( ) {
        System.out.println("gagalari vardir");
    }
    public void cogalma() {
        System.out.println("yumurtayla cogalirlar");
    }

}
