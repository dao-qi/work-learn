package chapter2;


public class Exercise8 {
    static int anInt=10;

    public static void main(String[] args) {
        Exercise8 e1=new Exercise8();
        Exercise8 e2=new Exercise8();
        Exercise8 e3=new Exercise8();
        System.out.println("E1.anint"+e1.anInt);
        e1.anInt++;
        System.out.println("e2.anint:"+e2.anInt);
        System.out.println("e2.anint:"+e3.anInt);
    }
}
