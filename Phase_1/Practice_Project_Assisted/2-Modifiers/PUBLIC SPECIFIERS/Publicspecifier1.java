
import .*;
public class Publicspecifier1 {
	    public static void main(String[] args) {
	        Publicspecifier myObject = new Publicspecifier();
	        
	        // Accessing a public variable
	        myObject.myPublicVariable = 10;
	        System.out.println("myPublicVariable value: " + myObject.myPublicVariable);
	        
	        // Calling a public method
	        myObject.myPublicMethod();
	    }
	}
