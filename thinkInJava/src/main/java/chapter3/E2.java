package chapter3;


public class E2 {
    float f;

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public static void main(String[] args) {
        E2 oneE2=new E2();
        E2 towE2=new E2();
        oneE2.setF(1f);
        towE2.setF(2f);
        System.out.println("one:"+oneE2.f);
        System.out.println("two:"+towE2.f);
        oneE2=towE2;
        oneE2.setF(12);
        System.out.println("one:"+oneE2.f);
        System.out.println("two:"+towE2.f);
    }
}
