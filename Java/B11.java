
public class B11 extends Thread{
    public void run(){
         for(int i=0;i<20;i++){
            System.out.println("call no:"+i);
        
        try{
            sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    }
}
