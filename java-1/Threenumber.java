
package threenumber;
import java.util.Scanner;

public class Threenumber {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a,b,c;
       System.out.println("enter the number a:");
       a=sc.nextInt();
        System.out.println("enter the number b:");
       b=sc.nextInt();
        System.out.println("enter the number c:");
       c=sc.nextInt();
       
       if(a>b&&a>c){
           System.out.println("the big number is a");
       }
     else if(b>c&&b>a){
           System.out.println("the big number is b");
       }
     else if(c>a&&c>b){
           System.out.println("the big number is c");
       }  
       
      sc.close();
       
    }
    
}
