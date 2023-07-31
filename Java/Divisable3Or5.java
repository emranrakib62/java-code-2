import java.util.Scanner;
public class Divisable3Or5 {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      


    
        

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : arr) {
            if (num % 3 == 0 || num % 5 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of numbers divisible by 3 or 5: " + sum);
    }
}

        
        
    



