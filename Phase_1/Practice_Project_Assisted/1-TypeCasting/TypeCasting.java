
import java.util.Scanner;
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k=new Scanner(System.in);
		
		// ask users to enter the number
	    System.out.println("Enter the  value of Input");
	    int i=k.nextInt();
	    
	    // widening or automatic type conversion
	    long l = i;  
	    float f = l;  
	    double d= f;
	    System.out.println("implicit  Typecasting: ");
	    System.out.println("Int value "+i); 
	    System.out.println("Long value "+l); 
	    System.out.println("Float value "+f); 
	    System.out.println("Double value "+d); 
	    
	    System.out.print("\n");
	    // narrowing or explicit type conversion 
	    System.out.println("Enter the  value of Input");
	    double d1=k.nextDouble();
        float f1=(float)d1;
        
        //explicit type casting 
        long l1 = (long)d1; 
        
        //explicit type casting  
        int i1 = (int)l1; 
        
      //explicit type casting 
        char c=(char)i1;
         
        System.out.println(" Explicit Typecasting: ");
        System.out.println("Double value: "+d1); 
        System.out.println("Float value: "+f1);
        System.out.println("Long value: "+l1);  
        System.out.println("Int value: "+i1);  
        System.out.println("Character: "+c); 
	}

}
