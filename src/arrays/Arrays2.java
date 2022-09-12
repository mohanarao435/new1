package arrays;

import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array:");
		int size=scan.nextInt();
		int a[]=new int[size];
		System.out.println("Enter Values : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=scan.nextInt();
		}
		System.out.println("Array values are :");
		for(int x : a)
		{
			System.out.println(x);
		}

	}

}
