package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
@AfterClass

	public void afterclass() {  //runs sixth
		System.out.println("afterClass");
}

@Test
	public void test1() {    //runs forth
		System.out.println("test");
}

@Test
	public void test2() { //runs ninth
	System.out.println("test2");
}

@Test
	public void test3() {//rune eleventh
		System.out.println("test3");
}

@BeforeClass
	public void beforeClass() {   //runs second
		System.out.println("beforeClass");
}

@BeforeMethod
	public void beforemethod() {   //runs third
	System.out.println("beforemethod");
}
@AfterMethod
	public void afterMethod() { // runs fifth
	System.out.println("afterMethod");
}
@BeforeTest
	public void befortest() {    //runs First
		System.out.println("beforetest");
	}
@AfterTest
	public void aftertest() {  //runs seventh
		System.out.println("afterteat");
}

@AfterClass
	public void afterClass1() {//runs tenth
		System.out.println("afterClass1");
}

@Test
	public void test4() {  //runs twelve
		System.out.println("test4");
}

@Test
	public void test5() { // runs thirthneen
		System.out.println("test5");
}

@BeforeClass
	public void beforeclass2() { //runs seconds
		System.out.println("beforeclass2");
}
}
