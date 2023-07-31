
public class Test1 {
   
    
       private int birthYear;
    protected int age;
    public void MyClass(int birthYear) {
        this.birthYear = birthYear;
        this.age = calculateAge();
    }
    private int calculateAge() {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - this.birthYear;
    }
    protected boolean isDivisibleByFive(int number) {
        return number % 5 == 0;
    }
    public void displayWelcomeMessage(String name) {
        System.out.println("Welcome, " + name + "!");
    }
    void myDesire() {
        System.out.println("This is my desire!");
    }
} 



