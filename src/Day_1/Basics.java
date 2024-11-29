package Day_1;

public class Basics {

	public static void main(String[] args) {
		
		System.out.println("hello java ");
		
		int a=29;
		System.out.println(a);
		
		String str="john";
		System.out.println(str);
		
		//casting
		 double dvalue =33.12;
		 int intvalue =(int)dvalue;
		System.out.println(intvalue);
		System.out.println(dvalue);
		
		/////////////////////////////////////////
		
		int b=10;
		if(b>18)
		{
			System.out.println("man is eligible to vote casting");
			
		}
		else 
		{
			System.out.println("man is not eligible for voing");
		}
		
		int c=100;
		if(c<50)
		{
			System.out.println("Grade 3");
		}
		else if(c>60 && c<70)
		{
			System.out.println("Grade 2");
		}
		else
		{
			System.out.println("Grade 1");
		}
	}
	
	
}
