package chapter2;

class StaticTest {
    static int i = 90;
}

public class Exercise7 {

    static void increment() {
        StaticTest.i++;
    }

    public static void main(String[] args) {
        Exercise7 sf = new Exercise7();
        sf.increment();
        Exercise7.increment();
        increment();
    }

}
