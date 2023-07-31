
public class Thread12 extends Thread{
    Table t;
    Thread12(Table t){
        this.t=t;
        
    }
    public void run(){
       synchronized(t){
        t.printable(1000);
        
       }
    }
}
