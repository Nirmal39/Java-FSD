
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class REGULAREXPRESSIONS {


	    public static void main(String[] args) {
	        
	        String input = "The quick brown fox jumps over the lazy dog";
	        
	        // Creating a pattern to match words starting with 'q'
	        Pattern pattern = Pattern.compile("\\bq\\w*\\b");
	        Matcher matcher = pattern.matcher(input);
	        
	        // Finding and displaying all the matches
	        while (matcher.find()) {
	            System.out.println(matcher.group());
	        }
	    }
}
