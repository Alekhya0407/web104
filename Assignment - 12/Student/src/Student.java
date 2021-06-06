public class Student {   
int id;  
String name;  
  
Student(int i, String n){  
id = i;  
name = n;  
}  
  
public static void main(String[] args) {  
Student s = new Student(11,"kitty");    
System.out.println(s.id);   
System.out.println(s.name); 
}  
}
