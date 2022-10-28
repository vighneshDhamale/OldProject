package basic;

public class Basic {
	public void straightline() {
		for(int a=1;a<=7;a++)
		{
			//for(int i=10;i>=a;i--)
		{
			System.out.print(" *");
		}
		//System.out.println(" ");
		}
	}
	
	public void line() {
		for(int a=1;a<=13;a++)
		{
			for(int i=12;i>=a;i--)
			{
				System.out.print(" ");
			}
			System.out.println("*");
	}
		
	}	
	
	
	
public static void main(String []args) {
			Basic obj=new Basic();
			obj.straightline();
		    obj.line();
           obj.straightline();
}

}		
		
		
		
		
		


