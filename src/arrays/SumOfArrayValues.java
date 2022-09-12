package arrays;

import java.util.Scanner;

public class SumOfArrayValues {

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
		int sum=0;
		for(int x : a)
		{
			sum=sum+x;
		}
		System.out.println("Sum = "+sum);

	}

}
