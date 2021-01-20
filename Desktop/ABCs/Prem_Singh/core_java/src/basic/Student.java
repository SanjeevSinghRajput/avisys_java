package basic;

public class Student {

	int id;
	String name;
	String address;

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2=new Student(); 
		s1.id = 111;
		s1.name = "Sanjeev";
		s1.address = "Pune";
		s2.id = 112;
		s2.name = "Rohan";
		s2.address = "Nashik";
	
		

		System.out.println(s1.id + " " + s1.name + "  " + s1.address);
		System.out.println(s2.id + " " + s2.name + "  " + s2.address);

	}

}
