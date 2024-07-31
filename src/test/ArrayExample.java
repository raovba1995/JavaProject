package test;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {4,6,8,12,34};
		
		System.out.println("First number " + numbers[0]);
		System.out.println("Fourth number " + numbers[3]);
		
		System.out.println(numbers.length);
		System.out.println("last number " +numbers[numbers.length-1]);
		
		String[] names = {"anu", "banu", "chandu", "eva"};
		
		char[] vowels = {'a', 'e','i','o','u'};
		
		String fname = "Vibha";
		char[] ch = fname.toCharArray();
		System.out.println(ch[0]);
		System.out.println(ch);
		
		String str1 ="My name is nik";
		String[] words = str1.split(" ");
		//System.out.println(words);
		System.out.println("First word is "+ words[0]);
		System.out.println("Second word is "+ words[1]);

	}

}
