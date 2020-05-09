package chapter3;

public class E12 {
    public static void main(String[] args) {
        int in=-1<<1;
        for (int i = 0; i <33 ; i++) {
            System.out.println(Integer.toBinaryString(in));
            in>>>=1;
        }
    }
}
