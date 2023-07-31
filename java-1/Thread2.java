
 class Thread2  extends Thread{
    
     Table t;
     Thread2(Table t){
         this.t=t;
     }
     public void run(){
         synchronized(t){
         t.printable(100);
         }
     }
     
}
