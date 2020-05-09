package chapter5;

import java.io.PrintWriter;

public class E14 {
    static  String s1="s1";
    static String s2;
    static {
        s2="s2";
    }
    public static void print(){
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args) {
        E14.print();
    }

}
