package chapter3;

public class E8 {
    public  long l;

    public static void main(String[] args) {
        E8 e8=new E8();
        e8.l=0x12;
        System.out.println(e8.l);
        System.out.println(Long.toBinaryString(e8.l));

        /*
         *  18
            10010
         */
    }
}
