package Week3Day1Assignment;

public class Student extends Department{
	public void studentName() {
		System.out.println("Name of the student");
	}
	public void studentDept() {
		System.out.println("Name of the student's Department");
	}
	public void studentId() {
		System.out.println("Name of the student's ID");
	}
	//Multilevel inheritance
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.CollegeCode();
		obj.CollegeName();
		obj.CollegeRank();
		obj.deptname();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
	}

}
