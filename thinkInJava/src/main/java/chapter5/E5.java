package chapter5;

public class E5 {
    public static void main(String[] args) {
        Dog d=new Dog();
        System.out.print("int");
        d.bark(1);
        byte b=1;
        System.out.print("byte");
        d.bark(b);
        char c=1;
        System.out.print("char");
        d.bark(c);
        System.out.print("long");
        d.bark(1l);
        System.out.print("float");
        d.bark(1f);
        short sh=1;
        System.out.print("short");
        d.bark(sh);
        System.out.print("double");
        d.bark(0.2d);
        System.out.println("bool");
        d.bark(true);
    }

}

class Dog{

    public void bark(byte b){
        System.out.println("byte:"+b);
    }
    public void bark(short s){
        System.out.println("short:"+s);
    }
    public void bark(int i){
        System.out.println("int:"+i);
    }
    public void bark(long l){
        System.out.println("long:"+l);
    }
    public void bark(char c){
        System.out.println("char:"+c);
    }
    public void bark(boolean b){
        System.out.println("boolean:"+b);
    }
    public void bark(float b){
        System.out.println("float:"+b);
    }
    public void bark(double b){
        System.out.println("double:"+b);
    }

}
