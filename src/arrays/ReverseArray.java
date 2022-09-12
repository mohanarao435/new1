package arrays;

import java.util.Scanner;

public class ReverseArray {

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
		System.out.println("Array values  before Reverse :");
		for(int x : a)
		{
			System.out.print(x+" ");
		}
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++,j--)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		System.out.println("\nArray values after Reverse :");
		for(int x : a)
			System.out.print(x+" ");
		
	

	}

}
