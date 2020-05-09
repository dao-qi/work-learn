package chapter5;

public class E17 {
    E17(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        E17[] es=new E17[6];
        //E18
        for (int i = 0; i < es.length; i++) {
            es[i]=new E17("cj");
        }
    }
}
