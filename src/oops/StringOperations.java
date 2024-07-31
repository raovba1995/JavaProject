package oops;

public class StringOperations {

	public String ReverseString(String str1) {

		String result = "";

		for (int i = str1.length() - 1; i >= 0; i--) {

			result = result + str1.charAt(i);
		}

		return result;

	}
	
    public boolean isPalindrome(String str1) {
    	
    	/*String str2 = "";
    	
    	
    	for (int i = str1.length() - 1; i >= 0; i--) {

			str2 = str2 + str1.charAt(i);
		}
    	boolean t = (str1.equals(str2)) ;
    	
    	return t;*/
    	
    	/*String rev = ReverseString(str1);
		if(str1.equals(rev)) {
			return true;
		}else {
			return false;
		}*/
    	

		boolean result = str1.equals(ReverseString(str1));
		return result;


    	
    		
    	
    	
		
	}


}
