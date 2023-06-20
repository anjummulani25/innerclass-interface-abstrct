
abstract class Animal {
  
  public abstract void animalSound();
  
  public void sleep() {
    System.out.println("Zzz");
  }
}


class Dog extends Animal {
  public void animalSound() {
    
    System.out.println("The dog says: Bhu Bhu Bhu");
  }
}

class Main {
  public static void main(String[] args) {
    Dog d=new Dog();
    d.animalSound();
    d.sleep();
  }
}
 
 
 

