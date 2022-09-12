package arrays;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		String name=scan.nextLine();
		System.out.println("String before Reverse :"+name);
		char a[]=name.toCharArray();
		int j=a.length-1;
		for(int i=0;i<a.length/2;i++,j--)
		{
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		String revname=new String(a);
		System.out.println("String after Reverse :"+revname);
		if(revname.equals(name))
		System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
			
		

	}

}
