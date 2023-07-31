
public class Person1 {
    
   public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.age=1990;
        System.out.println("Age: " + obj.age);
        System.out.println("Is 10 divisible by 5? " + obj.isDivisibleByFive(10));
        obj.displayWelcomeMessage("John");
        obj.myDesire();
    }
    
}

