package chapter5;

public class E19 {

    E19(String ...strings){
        for (String s : strings) {
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        String[] ss=new String[]{
                "aaaa",
                "bbbb",
                "cccc",
                "dddd"
        };
        E19 e1=new E19("a","b","c");
        e1=new E19(ss);
    }
}
