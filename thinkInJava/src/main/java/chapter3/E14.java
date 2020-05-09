package chapter3;

import javax.sound.midi.Soundbank;

public class E14 {
    public  static String copString(String a,String b){
        System.out.print("==");
        System.out.println(a==b);
        System.out.print("equals:");
        System.out.println(a.equals(b));
        return "";
    }
    public static void main(String[] args) {
        String a="hello world";
        String b="hello world";
        String c=new String("hello world");
        System.out.println("a,b"+copString(a,b));
        System.out.println("a,c"+copString(a,c));
        System.out.println("a,helloword"+copString(a,"hello world"));
        System.out.println("c,helloword"+copString(c,"hello world"));


        Integer[] arr;
        arr=new Integer[]{new Integer(1)};

        int [] inta;
        inta=new int[]{1,2,3};

    }
}
