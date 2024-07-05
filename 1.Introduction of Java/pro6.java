import java.util.*;
class pro6 
{
	public static void main(String[]args)
	{
		//int choice; 
		String str; 
		char ch;
		System.out.println("Enter the string");  
		
		
		Scanner sc=new Scanner(System.in); 
		str=sc.nextLine(); 
		ch=str.charAt(0);
		//choice=sc.nextInt(); 
		
		switch(ch) 
		{  
		default:System.out.println("There is another Number"); 
		          return; 
		  case 65:System.out.println("One");
		         break;
		  case 2:System.out.println("Two");
		         return;   // can we use the retu
		  
		}
	
	}
}	
	