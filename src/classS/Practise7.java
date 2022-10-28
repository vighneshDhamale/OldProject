package classS;

public class Practise7 {
public static void siddhesh() {  // static method
	System.out.println("i am siddhesh");
}
public  void sanket() {  // non static method
	System.out.println("i am sanket");
}

public static void main(String[] args) {  // main method
	Practise7.siddhesh();// do not need create a object because it's a static method(we can directly call)

Practise7 obj=new Practise7();//need to create a object to call non static method.
obj.sanket();
}
}
