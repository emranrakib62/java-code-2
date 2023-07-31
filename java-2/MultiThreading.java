
 class MultiThreading implements Runnable {
    public void run(){
         for(int i=0;i<5;i++){
  System.out.println("bd");
  try{
      Thread.sleep(2000);
  }catch(InterruptedException e){
      System.out.println(""+e);
      
      
  }
 
    }
}
}
