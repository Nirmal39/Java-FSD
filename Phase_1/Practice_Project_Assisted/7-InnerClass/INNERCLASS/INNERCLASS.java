

public class INNERCLASS {

	    private int outerVariable = 10;

	    // Inner class inside the outer class
	    public class InnerClass {

	        public void innerMethod() {
	            System.out.println("Inner method called");
	            System.out.println("Outer variable value: " + outerVariable);
	        }

	    }

	    public static void main(String[] args) {
	        INNERCLASS outer = new INNERCLASS();
	        InnerClass inner = outer.new InnerClass();
	        inner.innerMethod();
	    }
}
