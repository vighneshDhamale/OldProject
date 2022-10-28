package classS;  // method with parameter

public class Practise8 {
	public static void pranesh() {  // static method
		int a=5;   // int a is a parameter
		int b=10;  // int b is a parameter
		{
			System.out.println(a*b);
		}
	}
		public void sanket() {  // non static method
			int c=10;
			int d=5;
			{
				System.out.println(c+d);
			}
		
		}
	public static void main(String [] args) { // main method
		Practise8.pranesh();// dierctly call static method
	
	Practise8 obj=new Practise8(); // to call non static method we create a object
	obj.sanket();
	
	}
	}
