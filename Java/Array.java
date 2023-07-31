import java.util.*;
public class Array {
    public static void main(String[] args) {
        int n,i;
        int a[]=new int [5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value:");
        n=sc.nextInt();
        for(i=0;i<n;i++){
            System.out.println("enter a["+i+"]: ");
            a[i]=sc.nextInt();
        }
          for(i=n-1;i>=0;i--){
            System.out.println(""+a[i]);
    }
 
}
}