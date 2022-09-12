package oops;

public class Child implements Parent,Parent2{

	@Override
	public void sum() {
		int a=10,b=20;
		System.out.println("sum :"+(a+b));
		
	}

	public void mul() {
		int a=55,b=20;
		System.out.println("mul :"+(a*b));
		
	}
	

}
