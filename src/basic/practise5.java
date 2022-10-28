package basic;

public class practise5 {
	public static void main(String[] args)
	{
		for(int i=3;i>=1;i--)
		{
			
		for(int j=1;j<=5;j++)
		
		{
			
			if(i==2 && j==3)
			{
				System.out.print(" ");
			}
			if(i==1 && j>=2 && i==1 && j<=4)
			{
				System.out.print(" ");
			}
			else if(i==2 && j==5)
			{
				System.out.print("");
			}
			else
			{
				System.out.print("*");
			}
		}
	System.out.println();
	} 

}
}