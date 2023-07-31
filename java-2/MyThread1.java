
public class MyThread1 extends Thread {
     public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Thread 2"+i);
            try{
                sleep(4000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }

    
}
