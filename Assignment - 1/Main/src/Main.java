class Demo {  
  
   // static variable  
   static int a = 10;  
    
   // non-static or local variable  
   int b = 20;  
}  
  
public class Main {  
   public static void main(String[] args) {  
       Demo obj = new Demo();  
  
       // accessing the non-static variable  
       System.out.println("Value of non-static variable is: " + (obj.b));  
  
       // accessing the static variable  
       System.out.println("Value of static variable is:" + (Demo.a));  
   }  
}  
