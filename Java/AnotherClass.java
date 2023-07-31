 class Rakib {
    
    private int birthYear;
    protected int age;
    void Rakibss(int birthYear) {
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


public class AnotherClass {
    public static void main(String[] args) {
        Rakib obj = new Rakib();
        obj.Rakibss(1999);
        System.out.println("Age: " + obj.age);
        System.out.println("Is 10 divisible by 5? " + obj.isDivisibleByFive(10));
        obj.displayWelcomeMessage("John");
        obj.myDesire();
    }
}

