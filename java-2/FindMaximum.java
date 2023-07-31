import java.util.Scanner;
public class FindMaximum {
    


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int largest = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;

        System.out.println("The largest number is: " + largest);
    }
}


