abstract class Person{
  abstract void eat();
}

class TestAnnonymousInner{
 public static void main(String args[]){
  Person p=new Person(){
  void eat(){System.out.println("nice fruits");}
  };

  p.eat();
 }
}
