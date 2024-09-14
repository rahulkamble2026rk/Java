 import java.util.*;
 
 class pro3
{
	public static void main(String[]args)
	{
		int arr[];
		arr=newArray(3);
		 System.out.println(arr);
	} 
	static int[]newArray(int x)
	{ 
	   int arr[]=new int[x];   // this is valid in the java
	   int y; 
	   Scanner sc=new Scanner(System.in); 
	   for(int i=0;i<x;i++)
	   {
		   y=sc.nextInt(); 
		   arr[i]=y;
	   }
	   return arr;
	}  
}