package polymorphism;

public class Overriding {

	public void m1() {
		System.out.println("First Method");
	}
	
	public static void main(String[] args) {
		Overriding ref=new Overriding();
		
		ref.m1();
	}

}
