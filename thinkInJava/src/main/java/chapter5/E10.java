package chapter5;

import java.awt.peer.SystemTrayPeer;

public class E10 {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize方法");
    }

//    public static void main(String[] args) {
//        E10 e=new E10();//什么都没有输出
//    }
    public static void main(String[] args) {
        E10 e=new E10();
        e=null;
        System.gc();
        System.out.println(".....");
    }
}
