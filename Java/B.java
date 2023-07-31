
 class B extends A {
  String x;   
     
   void display(){
       System.out.println("Normal variable="+x);
        System.out.println("Static variable="+super.x);
   }
         public static void main(String[] args) {
        
        B b=new B();
      A.x="hoque";
        b.x="Emranul";
       
        b.display();
       
    }
        
    }

