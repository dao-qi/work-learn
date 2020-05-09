package chapter3;

import java.awt.print.PrinterGraphics;

public class E10 {
    //1010
    int i=0xaaa;
    //0101
    int b=0x555;

    public static void main(String[] args) {
        E10 e=new E10();

        System.out.println ("i:"+ Integer.toBinaryString(e.i) );
        System.out.println ("b:"+Integer.toBinaryString(e.b) );
        int and=e.i&e.b;
        int or=e.i|e.b;
        int xor = e.i ^ e.b;
        System.out.println("and:"+Integer.toBinaryString(and));
        System.out.println("or:"+Integer.toBinaryString(or));
        System.out.println("xor:"+Integer.toBinaryString(xor));
        /*
        i:101010101010
         b:10101010101
        and:0
        or:111111111111
        xor:111111111111
         */
    }
}
