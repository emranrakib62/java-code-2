
public class Thread11 extends Thread{
    Table t;
    Thread11(Table t){
        this.t=t;
    }
    public void run(){
        synchronized(t){
        t.printable(2000);
    }
        
    }
}
