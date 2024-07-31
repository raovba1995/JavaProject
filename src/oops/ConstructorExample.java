package oops;

public class ConstructorExample {
	String Name;
	int rollNo;
	int std;
	
	public ConstructorExample(String name, int rollno) {
		this.Name = name;
		this.rollNo = rollno;
		
	}
	
	public ConstructorExample(String name, int rollno, int std) {
		this.Name = name;
		this.rollNo = rollno;
		this.std = std;
		
	}

}
