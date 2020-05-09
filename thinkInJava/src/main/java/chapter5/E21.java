package chapter5;


import javax.swing.event.SwingPropertyChangeSupport;

public class   E21 {
    public static void main(String[] args) {
        for (EnumMoney value : EnumMoney.values()) {
            System.out.println(value+":"+value.ordinal());
            switch (value){
                case  one : System.out.println("1元");break;
                case  two : System.out.println("2元");break;
                case  three : System.out.println("3元");break;
                case  four : System.out.println("4元");break;
                case  five : System.out.println("5元");break;
                case  six : System.out.println("6元");break;
            }
        }
        //one:0
        //two:1
        //three:2
        //four:3
        //five:4
        //six:5

    }
}
enum EnumMoney{
    one,two,three,four,five,six
}



