
public class R2 {
        public static void main(String[] args) {
         R s1=new R();
        R1 s2=new R1();
         Thread t1=new Thread(s1);
       Thread t2=new Thread(s2);
        t1.start();
      t2.start();
    }

}
