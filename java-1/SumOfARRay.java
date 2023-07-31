 import java.util.*;
public class ARRay {
    public static void main(String[] args) {
     

        Scanner sc =new Scanner(System.in);
        int i,n,j;
        int size;
        System.out.println("Enter the size:");
        size=sc.nextInt();
        int a[][]=new int[size][size];
        System.out.println("Enter the Element:");
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
            a[i][j]=sc.nextInt();
        }
        }
        for(i=0;i<a.length;i++){
            for(j=0;j<a.length;j++){
            System.out.println("enter a["+i+"]["+j+"]:"+a[i][j]+"\t");
        }
        }
        System.out.println("");
    }
}	


    
	


    

