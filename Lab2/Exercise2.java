package Lab2;

import java.util.Scanner;
import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	Exercise2 obj=new Exercise2();
	System.out.println("enter the number of elements in array: ");
	int n=sc.nextInt();
	String arr[]=new String[n];
	System.out.println("enter the array elements: ");
	for (int i=0;i<n;i++)
	{
		String x=sc.nextLine();
		arr=obj.insertIntoArray(arr,x,i);
	}
	arr=obj.sortStrings(arr);
	System.out.println("the elements are: ");
	obj.printArray(arr);
}
public String[] sortStrings(String arr[])
{
	
	Arrays.sort(arr);
	String s1, s2;
	int mid;
	for(int i = 0; i < arr.length; i++) {
		mid = (int) Math.ceil(arr[i].length()/2.0);
		s1 = (arr[i].substring(0,mid)).toUpperCase();
		s2 = (arr[i].substring(mid,arr[i].length())).toLowerCase();
		arr[i] = s1 + s2;
	}

return arr;
}
public String[] insertIntoArray(String arr[],String element,int position)
	{
		arr[position]=element;
		return arr;
	}
public void printArray(String arr[])
{
	for (int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]+" ");
	}
}

}
