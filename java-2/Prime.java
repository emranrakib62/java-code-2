
public class Prime extends Thread{
    public void run(){
        int i,n=29;
        for(i=2;i<n;i++){

    if(n%i==0){
    System.out.println("is not prime"+n);
        break;
    }
}
if(i==n)
    System.out.println( n+ "prime number");

try {
sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}

