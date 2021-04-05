package Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements of array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements: ");
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		Exercise3 obj=new Exercise3();
		arr=obj.getSorted(arr);
		System.out.println("the sorted elements after reversing individual elements are: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	
	public int[] getSorted(int arr[])
	{
		for (int i=0;i<arr.length;i++)
		{
			int rev=0;
			while(arr[i]!=0)
			{
				int r=arr[i]%10;
				rev=rev*10 +r;
				arr[i]=arr[i]/10;
			}
			arr[i]=rev;
		}
		Arrays.sort(arr);
		return arr;
	}
   
}
