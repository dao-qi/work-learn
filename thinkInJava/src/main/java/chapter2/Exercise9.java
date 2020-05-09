package chapter2;

public class Exercise9 {
    byte b=0;
    short s=0;
    int i=19;
    long l=20l;
    float f=0.4f;
    double d=0.12d;
    char c='a';
    boolean bool=true;

    public static void main(String[] args) {
        Exercise9 e=new Exercise9();
        Byte B=e.b;
        System.out.println(B);

        Short S=e.s;
        System.out.println(S);

        Integer I=e.i;
        System.out.println(I);

        Long L=e.l;
        System.out.println(L);

        Float F=e.f;
        System.out.println(F);

        Double D=e.d;
        System.out.println(D);

        Character Ch=e.c;
        System.out.println(Ch);

        Boolean Boo=e.bool;
        System.out.println(Boo);
    }
}
