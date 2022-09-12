package oops;

public class TestIface {

	public static void main(String[] args) {
		Parent p = new Child();
		Parent2 p1 = new Child();
		p.sum();
		p.mul();
		p1.sum();
		p1.mul();

	}

}
