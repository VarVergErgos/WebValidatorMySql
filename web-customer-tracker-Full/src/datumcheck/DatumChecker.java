package datumcheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatumChecker {

	  // Returns true if d is in format 
    // /dd/mm/yyyy 
    public static boolean isValidDate(String d) 
    { 
        String regex = "^(1[0-2]|0[1-9]).(3[01]|[12][0-9]|0[1-9]).[0-9]{4}$"; 
        Pattern pattern = Pattern.compile(regex); 
        Matcher matcher = pattern.matcher((CharSequence)d); 
        return matcher.matches(); 
    } 
  
    public static void main(String args[]) 
    { 
        System.out.println(isValidDate("10/12/2016")); 
        System.out.println(isValidDate("10/02/18")); 
    } 
	
	
}
