interface Animal {
  public void animalSound(); 
  public void sleep(); 
}


class Cat implements Animal {
  public void animalSound() {

    System.out.println("The cat says:meaw meaw ");
  }
  public void sleep() {
  
    System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
   Cat c=new Cat(); 
    c.animalSound();
    c.sleep();
  }
}