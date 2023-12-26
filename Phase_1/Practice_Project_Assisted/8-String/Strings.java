

public class Strings {

	public class string {
		public static void main(String a[]) {
			String var1="Nirmal G";
			String var2="priya";
			System.out.println(var1.charAt(4));
			System.out.println(var1.codePointAt(4));
			System.out.println(var1.codePointBefore(4));
			System.out.println(var1.codePointCount(0,4));
			System.out.println(var1.compareTo(var2));
			System.out.println(var1.concat(var2));
			System.out.println(var1.compareToIgnoreCase(var2));
			System.out.println(var1.contains(var2));
			System.out.println(var1.endsWith("u"));
			System.out.println(var1.equals(var2));
			System.out.println(var1.equalsIgnoreCase(var2));
			System.out.println(var1.hashCode());
			System.out.println(var1.indexOf("n"));
			System.out.println(var1.isEmpty());
			System.out.println(var1.length());
			System.out.println(var1.replace("h","a"));
			System.out.println(var1.startsWith("b"));
			System.out.println(var1.toUpperCase());
			System.out.println(var1.toLowerCase());
			System.out.println(var1.trim());
			
			 // conversion from String object to StringBuffer 
	        StringBuffer sbr = new StringBuffer(var1); 
	        sbr.reverse(); 
	        System.out.println("String to StringBuffer");
	        System.out.println(sbr); 
	          
	        // conversion from String object to StringBuilder 
	        StringBuilder sbl = new StringBuilder(var1); 
	        sbl.append("world"); 
	        System.out.println("String to StringBuilder");
	        System.out.println(sbl);   
			}

	}

}
