//Static class
class Outer
{
int x=100;
 static class Inner{
int y=200;
}
}
public class CheckInOut1
{
public static void main(String[] args)
{
//Outer a=new Outer();
Outer.Inner b=Outer.new Inner();
System.out.println( b.y);
}
}