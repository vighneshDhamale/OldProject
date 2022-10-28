package classS;

import java.util.Arrays;

public class Ptracrtise16 {
	
	public static void main(String[] args) {    // main method
		int a[]= {55,70,85}; //declearing array a
		int a2[]= {47,78,55};
		int a3[]= {47,78,55};
		{
			System.out.println(Arrays.equals(a,a2));//compare array a and a2
		
		
			System.out.println(Arrays.equals(a2, a3));// compare array a2 and a3
		
		
			System.out.println(Arrays.equals(a3, a));// compare array a3 and a
		}
	}

}
