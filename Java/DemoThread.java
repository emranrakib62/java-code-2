
public class DemoThread {
    public static void main(String[] args) {
         MyThread m=new MyThread();
        m.start();
        MyThread1 m1=new MyThread1();
        m1.start();
    }
}
