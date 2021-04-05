package Lab2;

import java.util.Scanner;


public class Exercise4 {
	public static void main(String[] args) {
		
	
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of array elements: ");
	n=sc.nextInt();
	int arr[]=new int[n];
	System.out.println("enter the array elements: ");
	for (int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("entered elements are: ");
	for (int i=0;i<n;i++)
		System.out.println(arr[i]);
	Exercise4 obj=new Exercise4();
	arr=obj.sort(arr);
	int length=n;
	length=obj.modifyArray(arr,length);
	System.out.println("the required array elements in descending order after removing duplicates are: ");
	for (int i=length-1;i>=0;i--)
		System.out.println(arr[i]);
}
public int[] sort(int arr[]) {
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
	System.out.println("sorted array elements are: ");
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	return arr;
}
public int modifyArray(int arr[],int n)
{
	int[] temp=new int[n]; 
	int j=0;
	for (int i=0;i<n-1;i++)
	{
		if (arr[i]!=arr[i+1])
		{
			temp[j++]=arr[i];
		}
	}
	temp[j++]=arr[n-1];
	//System.out.println(j);
	for (int i=0;i<j;i++)
		arr[i]=temp[i];
	//System.out.println(j);
	return j;
}

}

