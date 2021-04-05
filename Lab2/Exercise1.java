package Lab2;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Exercise1 obj=new Exercise1();
		System.out.println("enter the number of elements in array: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the array elements: ");
		for (int i=0;i<n;i++)
		{
			int x=sc.nextInt();
			arr=obj.insertIntoArray(arr,x,i);
		}
		int secondsmallest=obj.getSecondSmallest(arr);
		System.out.println("the second smallest element is: "+secondsmallest);
}
public int getSecondSmallest(int arr[])
{
	int temp=0;
	for (int i=0;i<arr.length;i++)
	{
		for (int j=i+1;j<arr.length;j++)
		{
			if (arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr[1];
}
public int[] insertIntoArray(int arr[],int element,int position)
{
	arr[position]=element;
	return arr;
}
}