package chapter5;

public class E2 {
    String str1="string1";
    String str2;
    E2(){
        str2="string2";
    }

    public static void main(String[] args) {
        E2 e=new E2();
        System.out.println("str1"+e.str1);
        System.out.println("str2"+e.str2);
        //str1string1
        //str2string2
    }
}
