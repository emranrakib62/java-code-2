
 class Thread1 extends Thread {
  
     Table t;
     Thread1(Table t){
         this.t=t;
     }
     public void run(){
         synchronized(t){
             
         
         
         t.printable(5);
         }
     }
     
     
     
}
