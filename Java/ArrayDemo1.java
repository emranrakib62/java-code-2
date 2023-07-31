import java.util.*;
public class ArrayDemo1{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int i,n,j;
        int size;
        System.out.println("Enter the size:");
        size=sc.nextInt();
        int a[][]=new int[size][size];
        System.out.println("enter the element:");
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
            a[i][j]=sc.nextInt();
        }
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
            
         System.out.println("enter a["+i+"]["+j+"]:"+a[i][j]);
        }
        }
        int b[][]=new int[size][size];
        for(i=0;i<b.length;i++){
            for(j=0;j<b.length;j++){
            b[i][j]=sc.nextInt();
        }
        }
        for(i=0;i<b.length;i++){
            for(j=0;j<b.length;j++){
            
            System.out.println("enter b["+i+"]["+j+"]:"+b[i][j]);
        }
        }
         int c[][]=new int[size][size];
        for(i=0;i<c.length;i++){
            for(j=0;j<c.length;j++){
           System.out.println("enter c["+i+"]["+j+"]:"+(a[i][j]+b[i][j])+"\t");
        }
            System.out.println();
        }
    }
}
