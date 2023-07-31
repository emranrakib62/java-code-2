import java.util.*;
public class Arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int s=0;
        size=sc.nextInt();
        int a[]=new int[size];
        
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
            
            s=s+a[i];
            
            
            
            
        }
        System.out.println(""+s);
        
        
    }
}
