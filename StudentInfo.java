package Week3Day1Assignment;

public class StudentInfo {
// overloading
	public void getStudentInfo(int id) {
		System.out.println("ID of the student: "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("ID of the student: "+id);
		System.out.println("Name of the student: "+name);
	}
	public void getStudentInfo(String email,long phonenumber) {
		System.out.println("emailId of the student: "+email);
		System.out.println("phonenumber of the student: "+phonenumber);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo obj = new StudentInfo();
		obj.getStudentInfo(8);
		obj.getStudentInfo(2, "rashmi");
		obj.getStudentInfo("rashmi@gmail.com", 963852741);
	}

}
