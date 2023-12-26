

public class Defaultconstructor {
    int id;
    String name;
    
    // Default constructor
    public Defaultconstructor() {
        id = 0;
        name = null;
    }
    
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
    
    public static void main(String[] args) {
        // Creating an object of DefaultConstructorExample class
        Defaultconstructor obj = new Defaultconstructor();
        
        // Calling display method
        obj.display();
    }
}

