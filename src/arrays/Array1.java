package arrays;

public class Array1 {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		System.out.println("Size of array:"+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Array values using for each:");
		for(int x : a)
		{
			System.out.println(x);
		}
			

	}

}
