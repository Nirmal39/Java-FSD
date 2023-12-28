

public class Methodoverloading {
	    public static void main(String[] args) {
	        int num1 = 5;
	        int num2 = 10;
	        double dbl1 = 2.5;
	        double dbl2 = 3.7;
	        
	        int result1 = add(num1, num2);
	        double result2 = add(dbl1, dbl2);
	        int result3 = add(num1, num2, num2);
	        
	        System.out.println("Result 1: " + result1);
	        System.out.println("Result 2: " + result2);
	        System.out.println("Result 3: " + result3);
	    }
	    
	    public static int add(int a, int b) {
	        return a + b;
	    }
	    
	    public static double add(double a, double b) {
	        return a + b;
	    }
	    
	    public static int add(int a, int b, int c) {
	        return a + b + c;
	    }
}
