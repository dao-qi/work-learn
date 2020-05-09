package chapter3;

public class E11 {
    public static void main(String[] args) {
        int i=0x800;
        for (int j=0;j<12;j++)
        {
            System.out.println(Integer.toBinaryString(i));
            i>>=1;
        }
    }
}
