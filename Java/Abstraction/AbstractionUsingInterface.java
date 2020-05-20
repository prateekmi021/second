//Data Abstraction implementation using interfaces
//It is 100% Data abstraction
// Interface
interface Animal {
  // Interface method (does not have a body)
  public void animalSound();
  public void sleep();
}

class Dog implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The Dog says: woah woah");
  }
  public void sleep(){
	  System.out.println("Zzz");
  }
}


// Subclass (inherit from Animal)
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep(){
	  System.out.println("Zzz");
  }
}

class AbstractionUsingInterface {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
	
	Dog myDog = new Dog();
	myDog.animalSound();
	myDog.sleep();
  }
}
