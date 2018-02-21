/* Java program to show that if static method is redefined by
   a derived class, then it is not overriding. */
 
// Superclass
class Base {
     
    // Static method in base class which will be hidden in subclass 
    public static void display() {
        System.out.println("Static or class method from Base");
    }
    public  void display(String s) {
        System.out.println("Static or class method from Base=="+s);
    }
     // Non-static method which will be overridden in derived class 
      void print()  {
         System.out.println("Non-static or Instance method from Base");
    }
     
     public String tryTest() {
    	 
    	 try {
    		 
    		 return "in try 1 beforeFinally";
    	 }catch(ArithmeticException|ArrayIndexOutOfBoundsException e) {
    		 
    		 e.printStackTrace();
    	 }finally {
    		 
    		 System.out.println("i am from finally block");
    	 }
		return "in try 2 beforeFinally";
    	 
     }
}
 
// Subclass
class Derived extends Base {
     
    // This method hides display() in Base 
    public static void display() {
         System.out.println("Static or class method from Derived");
    }
     
    // This method overrides print() in Base 
    public void print() {
         System.out.println("Non-static or Instance method from Derived==");
   }
}
 
// Driver class
public class Test {
    public static void main(String args[ ])  {
       Base obj1 = new Derived();
       Derived d = new Derived();
       // As per overriding rules this should call to class Derive's static 
       // overridden method. Since static method can not be overridden, it 
       // calls Base's display() 
       obj1.display();  
       obj1.display("gopinadh");  
      System.out.println(obj1.tryTest());  
       // Here overriding works and Derive's print() is called 
       obj1.print();     
    }
}