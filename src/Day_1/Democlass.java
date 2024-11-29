package Day_1;

public class Democlass {

	int studentID;
	String studentName;
	String studentCity;

	// Behavior : member methods

	public void study() {
		System.out.println(studentName + " is studing");
	}

	public void showFulldetails()

	{
		System.out.println("my name is " + studentName);

		System.out.println("my id is " + studentID);
		System.out.println("student city is " + studentCity);
	}
	public static void main(String[] args) {
		
		Democlass dm;
		dm = new Democlass();
		dm.studentName="ram";
		dm.studentID=123;
		dm.studentCity="Nagpur";
		dm.showFulldetails();
		dm.study();
		
		Democlass st = new Democlass();
		st.studentName = "jbd";
		st.studentID =123;
		st.studentCity = "mumbai";
		
		
	}
}
