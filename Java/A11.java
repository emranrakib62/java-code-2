import java.util.*;
public class A11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int i;
        int p,n;  
        size=sc.nextInt();
        int a[]=new int[size];
        
        for( i=0;i<a.length;i++){
           
        a[i]=sc.nextInt();
               
        }
    
        for( i=0;i<a.length;i++){
            
           System.out.println("the result a["+i+"]: "+a[i]);  
           
           
        
        
        
        
        
               if(a[i]%2==0){
               
               System.out.println("even:: ");
           
               }
              
               
                   
                   else { 
                   
                    System.out.println("odd:: ");   
            
                           }
           
                   
        
        }
 
          
}
}