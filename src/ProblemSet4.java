/**
 * INSTRUCTIONS.
 * 
 * Welcome to Problem Set 4, where we'll dive into writing our own methods with
 * parameters and return values. The focus, this time, will be on the built-in @String
 * and @Math classes.
 * 
 * You'll note that most of the methods have not been included. Instead, you'll see
 * specifications pertaining to their signatures (i.e., the method name, as well as
 * its return type and parameter list). You'll need to be sure to meet these
 * specifications exactly.
 * 
 * As always, please be mindful of your output (in this case, returned values rather
 * than printed text). Your solutions will be tested against a set of expected
 * values, and the grading script will expect an exact match.
 * 
 * This problem set contains 10 exercises worth 50 points. It is due no later than
 * 11:59pm on Sunday, November 4, 2018. Good luck! 
 */

public class ProblemSet4 {
	
	public static void main(String[] args) {
		ProblemSet4 ps = new ProblemSet4();
	}
	
	public String surroundMe(String out, String in) {
		if (out != null && in != null) {
			if (out.length() == 4 && in.length() == 3) {
				return out.substring(0, 2) + in + out.substring(2);
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}

	
	public String endsMeet(String str, int n) {
		if (str != null) {
			if ((str.length() >= 1 && str.length() <= 10) && (n > 0 && n <= str.length())) {
				return str.substring(0, n) + str.substring(str.length() - n);
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	public String middleMan(String str) {
		if (str != null) {
			if (str.length() % 2 != 0) {
				return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	
	public String doubleVision(String str) {
		if (str != null) {
			String vision = new String();
			
			for (int i = 0; i < str.length(); i++) {
				vision += (str.substring(i, i + 1) + str.substring(i, i + 1));
				}
			
			if (str.length() >= 1) {
				return vision;
			}
			else {
				return null;
			}
		}
		else {
			return null;
		}
	}
	
	
	public Boolean centered(String str, String target) {
		if (target == null || str == null || target.length() != 3) {
			return false;
		}
		
		double middle = str.length() / 2.0;
		
		if (middle == (int) middle) {
			return str.substring((int) middle - 2, (int) middle + 1).equals(target) || str.substring( (int) middle - 1, (int) middle + 2).equals(target);
		}
		else {
			return str.substring((int) middle - 1, (int) middle + 2).equals(target);
		}
	}
	
	
	public Integer upOrDown(double n, char c) {
		int number;
		
		switch (c) {
		case 'r':
			number = (int)Math.round(n);
			break;
		case 'f':
			number = (int)Math.floor(n);
			break;
		case 'c':
			number = (int)Math.ceil(n);
			break;
		default:
			number = -1;
			break;
		}
		
		return number;
	}
	
	
	public Integer countMe(String text, char end) {
		if (text != null && Character.isLetter(end)) {
			int count = 0;
			String endCheck;
			
			for (int i = 0; i < text.length() - 1; i++) {
				if (!Character.isAlphabetic(text.charAt(i)) && !Character.isWhitespace(text.charAt(i))) {
					return -1;
				}

				endCheck = text.substring(i, i+2);
				
				if (Character.isWhitespace(endCheck.charAt(1)) && endCheck.charAt(0) == end) {
					count++;
				}
			}

			if (!Character.isAlphabetic(text.charAt(text.length() - 1)) && !Character.isWhitespace(text.charAt(text.length() - 1))) {
				return -1;
			}
			else if (text.charAt(text.length() - 1) == end) {
				count++;
			}
			
			return count;
		}
		else {
			return -1;
		}
		
	}
	
	public Boolean isNotEqual(String str) {
		int isCheck = 0;
		int notCheck = 0; 
		
		if (str == null) {
			return false;
		}
		
		if (str.length() == 0) {
			return false;
		}
		
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				isCheck++;
			}
			else if (i < str.length() - 2) {
				if (str.substring(i, i + 3).equals("not")) {
					notCheck++;
				}
			}
		}
		
		if (isCheck == notCheck) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public int triplets(String str) {
		if (str == null) {
			return -1;
		}
		
		int count = 0;
		
		for (int i = 0; i < str.length() - 2; i++) {
			if (!Character.isAlphabetic(str.charAt(i))) {
				return -1;
			}
			
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
		}
		
		return count;
	}
	
	
	public int addMe(String str, boolean digits) {
		int sum = 0;
		
		if (str == null) {
			return -1;
		}
		
		if (digits) {
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					sum += Character.getNumericValue(str.charAt(i));
				}
			}
		}
		else { 
			int check = 0;
			
			for (int i = 0; i < str.length(); i++) {
				if (Character.isDigit(str.charAt(i))) {
					check *= 10;
					check += Character.getNumericValue(str.charAt(i));;
				}
				else if (!Character.isAlphabetic(str.charAt(i))) {
					return -1;
				}
				else {
					sum += check;
					check = 0;
				}
			}
			
			sum += check;
		}
		
		return sum;
	}
}
