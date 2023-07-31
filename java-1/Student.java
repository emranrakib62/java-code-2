
 class Student {
 void add(int a,int b){
     System.out.println("a+b="+(a+b));  
 }   
 void add(double a,double b){
     System.out.println("a+b="+(a+b));  
 }   
 void add(int a,int b,int c){
     System.out.println("a+b+c="+(a+b+c));  
 }   
     public static void main(String[] args) {
        Student s1=new Student();
        s1.add(4,5);
        s1.add(6.5, 4.20);
        s1.add(8, 90, 40);
     }
 
 
 
 
 
 
}
