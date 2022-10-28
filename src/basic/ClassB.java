package basic;

public  class ClassB  extends ClassA {
   int j=25;
   
 
   public void demo() {
	   System.out.println("classB Property");
	   
   }
 public static void main(String [] args) {
	 ClassB obj=new ClassB();
	 obj.demo();
	System.out.println(obj.j);
	 obj.test();
	 System.out.println(obj.a);
	 System.out.println(obj.s);
	 
 }
}

