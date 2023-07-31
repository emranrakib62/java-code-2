
public class Prime1 extends Thread {
    public void run(){
        int i,n=100,j;
 for(i=2; i<=n; i++)
    {
        for(j=2; j<=i; j++)
        {

            if(i%j==0)
                break;
        }

        if(i==j)
            System.out.println(""+j);
    }
try {
sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}
}

