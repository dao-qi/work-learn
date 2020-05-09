package chapter2;

public class Exercise6 {
    String s = "ahhhhhhhhhhh!";
    int storage(String s) {
        return s.length() * 2;
    }
    void print() {
        System.out.println("storage(s) = " + storage(s));
    }

    public static void main(String[] args) {
        Exercise6 e=new Exercise6();
        e.print();
    }
}
