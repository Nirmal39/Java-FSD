
class Employee {
	    int id;
	    String name;
	    double salary;

	    // Parameterized constructor
	    public Employee(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    // Method to display employee information
	    public void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Salary: " + salary);
	    }
	}

	public class parameterizedconstructor {
	    public static void main(String[] args) {
	        // Creating objects using parameterized constructor
	        Employee emp1 = new Employee(101, "John", 50000.0);
	        Employee emp2 = new Employee(102, "Mary", 60000.0);

	        // Calling the display method on both objects
	        emp1.display();
	        emp2.display();
	    }
}
