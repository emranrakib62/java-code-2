import java.util.*;
public class ArrayDemo {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in); 
        int s=0;
        int size;
        System.out.println("enter the size::");
        size=sc.nextInt();
        int a[]=new int[size];
        
         for(int i=0;i<5;i++){
           a[i]=sc.nextInt();
          
         }
        
         for(int i=0;i<5;i++){
             if((a[i])/3==0)
                 s=s+a[i];
                 
             
              
         }
         
         
         
         System.out.println("the sum::::"+s);
         
         
}
}