
public class MultiThreading1 implements Runnable {
    public void run(){
         for(int i=0;i<5;i++){
  System.out.println("b");
  try{
      Thread.sleep(1000);
  }catch(InterruptedException e1){
      System.out.println(""+e1);
      
      
  }
 
    }
    }
}
