package test;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Alan");
		System.out.println("Alan sos");

		String fname = "Vibha";
		String lname = "Rao";

		System.out.println(fname);
		System.out.println(lname);

		String Fullname = fname + " " + lname;
		System.out.println(Fullname);

		System.out.println(Fullname.length());
		System.out.println(Fullname.toUpperCase());
		System.out.println(Fullname.toLowerCase());

		System.out.println(Fullname.charAt(Fullname.length() - 1));

		String Newname = Fullname.replace("Rao", "Digavi");
		System.out.println(Newname);
		
		boolean check = Newname.contains("Digavi");
		System.out.println(check);
		
		 char c = 'D';
		System.out.println(Newname.indexOf(c));

	}

}
