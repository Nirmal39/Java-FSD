 class ExampleClass {
    private int privateVariable;
    
    public ExampleClass(int value) {
        this.privateVariable = value;
    }
    
    private void privateMethod() {
        System.out.println("This is a private method.");
    }
    
    public void publicMethod() {
        System.out.println("This is a public method.");
        // Accessing the private variable and method
        System.out.println("Private variable value: " + this.privateVariable);
        this.privateMethod();
    }
}

public class Privatespecifier {
    public static void main(String[] args) {
        ExampleClass example = new ExampleClass(42);
        example.publicMethod();
    }
}

