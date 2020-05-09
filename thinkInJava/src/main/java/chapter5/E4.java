package chapter5;

public class E4 {

    E4(String s){
        System.out.println("e4构造器调用");
        System.out.println(s);
    }

    public static void main(String[] args) {
        E4 e=new E4("参数");
    }
}
