

public class CallByValue {
	    public static void main(String[] args) {
	        int x = 5;
	        
	        increment(x);
	    }
	    
	    public static void increment(int n) {
	        System.out.println("Inside the method: " + n);
	        n++;
	        System.out.println("After incrementing: " + n);
	    }


}
