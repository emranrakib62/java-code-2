
public class FindAreaMethodOverload {
   
    public static void main(String[] args) {
        double radius = 5.0;
        double base = 4.0;
        double height = 3.0;
        double side = 6.0;

        double circleArea = calculateArea(radius);
        double triangleArea = calculateArea(base, height);
        double squareArea = calculateArea(side);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Triangle: " + triangleArea);
        System.out.println("Area of Square: " + squareArea);
    }

    // Method to calculate the area of a circle
    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a triangle
    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a square
    public static double calculateAreaa(double side) {
        return side * side;
    }
}


