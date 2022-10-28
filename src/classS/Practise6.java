package classS;

public class Practise6 {
	public void amit(int a) {
	System.out.println("i am Non static");
	System.out.println(a);
	}

public void omkar(int b) {
	System.out.println("i am groot");
	System.out.println(b);
}

public static void main(String []args) {
	Practise6 Practise6=  new Practise6();
	Practise6.amit(12);
	Practise6.omkar(35);
}


}

