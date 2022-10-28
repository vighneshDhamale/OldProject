package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Annotations2 {
	@AfterClass
		public void afterclass() {// runs second
			System.out.println("afterclass");
	}

	@Test (priority=-2)// runs first
		public void test1() {
		System.out.println("test1");
	}
	@Test (invocationCount=3,priority=-3,enabled=false)//skipped
		public void test2() {
		System.out.println("test2");
	}
	
@Test(priority=-1,timeOut=1000)// test fail
	public void test3() throws InterruptedException {
	Thread.sleep(2000);
	System.out.println("test3");
}

@Test(dependsOnMethods= {"test3"} )// test skipped
public void test4() {
	System.out.println("test4");
}
}
