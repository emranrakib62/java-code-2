
public class BB {
    public static void main(String[] args) {
         B s1=new B();
         Thread t1=new Thread(s1);
        t1.start();
    }
}
