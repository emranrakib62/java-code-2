import java.util.*;
public class AAAa {
     public static void main (String[] args){
       Scanner input =new Scanner (System.in);
       
       int []a=new int [5];
       for(int i=0;i<5;i++)
       {
           a[i]=input.nextInt();
       }
       
       int larg=a[0];
       int sam=a[0];
       
       
       for(int i=1;i<5;i++)
       {
           if(a[i]>larg)
           {
               larg=a[i];
           }
           
           if(a[i]<sam)
           {
               sam=a[i];
           }
       }
       
       System.out.println("Largest number= "+larg);
       System.out.println("Smallest number= "+sam);
     }
}


