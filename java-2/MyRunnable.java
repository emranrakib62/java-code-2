
public class MyRunnable implements Runnable {
    Thread t;
    public MyRunnable(String tname){
        t=new Thread(this,tname);
        System.out.println("child thread"+t);
        t.start();
    }


public void run(){
for(int i=0;i<10;i++){
try{
    Thread.sleep(1000);
System.out.println(t.getName()+"  "+i);
}catch(InterruptedException e){
    e.printStackTrace();
}
}
}
}