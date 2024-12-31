import java.util.*; // we import this package to import the Scanner class in our code  
// check whether the given year is leap year or not  
class pro5 
{
	public static void main(String[]args)
	{
		int year;
		Scanner sc=new Scanner(System.in);
		year=sc.nextInt();
		if(year%100==0 && year %400==0) 
		{
			System.out.println("Enter Year is Leap year");
		}
		if(year%100!=0 && year %4==0)
		{
			System.out.println("Enter Year is Leap year"); 
		}
		else 
		{ 
	    System.out.println("Enter Year is not Leap year");
		}
	}
}	
		
