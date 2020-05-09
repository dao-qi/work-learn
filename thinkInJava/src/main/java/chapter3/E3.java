package chapter3;

class Leter{
    float f=9;
}

public class E3 {

    public static void fun(Leter l){
        l.f=1.9f;
    }
    public static void main(String[] args) {
        Leter l=new Leter();
        System.out.println("begin:"+l.f);
        E3.fun(l);
        System.out.println("after:"+l.f);
    }
}
