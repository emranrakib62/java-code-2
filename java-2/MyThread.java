
public class MyThread extends Thread {
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread 1"+i);
            try{
                sleep(2000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
    
}
