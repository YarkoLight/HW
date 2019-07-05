package hw3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
	
	 public static boolean checkUScurrency(String currencyUS) {
	        String pattern = "\\$(\\d*)(\\.\\d{2})";

	        Pattern p = Pattern.compile(pattern);
	        Matcher m = p.matcher(currencyUS);

	        while (m.find()) {
	            System.out.println(currencyUS + " valid");
	        }
	        if (m.matches() == false) {
	            System.out.println(currencyUS + " not valid");
	            return false;
	        }
	        return true;
	}

}
