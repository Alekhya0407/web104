class Samples
{
static int x = 10;
public static void main(String[] args)
{
System.out.println(x);
Samples s1 = new Samples();
s1.m1();
}
 public void m1()
{
System.out.println(x); 
}
}  
