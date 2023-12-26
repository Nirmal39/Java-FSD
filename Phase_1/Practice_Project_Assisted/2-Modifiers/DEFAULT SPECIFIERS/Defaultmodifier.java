

class MyClass {
  int x; // default access modifier
  
  void printX() { // default access modifier
    System.out.println("x = " + x);
  }
}

public class Defaultmodifier {
  public static void main(String[] args) {
    MyClass obj = new MyClass();
    obj.x = 5; // accessible within the same package
    obj.printX(); // accessible within the same package
  }
}

