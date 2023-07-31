import java.util.*;
public class ArrayDemo2 {
    public static void main(String[] args) {
        int n,pos=0,neg=0,z=0;
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array length:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("enter a["+i+"]:");
            a[i]=sc.nextInt();
            if(a[i]>0)
                pos++;
            else if(a[i]<0)
                neg++;
            else
                z++;
        }
        System.out.println("positive no:"+pos);
        System.out.println("negitive no:"+neg);
        System.out.println("Zero no:"+z);
    }
}
