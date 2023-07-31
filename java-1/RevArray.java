import java.util.*;
public class RevArray {
    public static void main(String[] args) {
       int i,n;
       int a[];
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of an arry::");
        n=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++){
            System.out.println("enter a["+i+"]:");
            a[i]=sc.nextInt();
        }
        System.out.println("Reverse Array: ");
        for(i=n-1;i>=0;i--){
            System.out.println(""+a[i]);
        }
    }
}
