package masai;

public class Student {

	int roll;
	String name;
	int marks;
	
	void displayStudentDetails()
	{
		System.out.println("Roll is : " + roll);
		System.out.println("Name is : " + name);
		System.out.println("Marks is : " + marks);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1 = new Student();
		obj1.roll=32;
		obj1.name = "Rahul";
		obj1.marks = 89;
		obj1.displayStudentDetails();
		obj1=null;
		
		Student obj2 = new Student();
		obj2.roll=40;
		obj2.name = "Saurabh";
		obj2.marks = 92;
		obj2.displayStudentDetails();
		obj2=null;
	}

}