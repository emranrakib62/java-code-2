
public class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t3){
        t=t3;
    }
    public void run(){
      synchronized(t){
          
        t.printtable(100);
    }
}
}