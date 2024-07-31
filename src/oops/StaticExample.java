package oops;

public class StaticExample {
	
	public String name;
	public int rollNo;
	public static String institute ="oxford";
	
	public StaticExample(String name, int rollNo) {
		
		this.name =name;
		this.rollNo = rollNo;
	}
	
	public static void displayinst() {
		System.out.println(institute);
	}

}
