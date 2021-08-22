package Week3Day1Assignment;

public class Desktop extends Computer  {
	public void desktopSize() {
		System.out.println("Size of the desktop");
	}
	public static void main(String[] args) {
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModels();
}
}