import java.util.regex.*;    
import java.util.*;    
public class EmailValidation{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("nirmal@domain.co.in");  
        emails.add("sonu@domain.com");  
        emails.add("ajack.name@domain.com");  
        emails.add("jack#@domain.co.in");  
        emails.add("sonika@domain.com");  
        emails.add("urmila@domaincom");  
        //Add invalid emails in list  
        emails.add("@yahoo.com");  
        emails.add("hello#domain.com");  
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }
    }
}