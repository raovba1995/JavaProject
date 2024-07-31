package test;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 40;
		int y = 90;

		if (x == y) {
			System.out.println("Both numbers are matching");
		} else if (x > y) {
			
			System.out.println(" x is greater than y");
		} else {
			
			System.out.println(" y is greater than x");
		}
		
		String str1 = "Vibha";
		String str2 = "vibha";
		String str3 = "gaurav";
		
		if (str1.equalsIgnoreCase(str2)) {
			
			System.out.println("Both string are matching");
		}else {
			
			System.out.println("Both the string are not matching");
		}
		
		//not equals to in string
		if (!str1.equals(str3)) {
			System.out.println("str1 and str3 are not matching");
			
		}

	}

}
