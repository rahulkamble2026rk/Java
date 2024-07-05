import java.util.*; 
class pro1 
{
	public static void main(String[]args)
	{
		int choice;
		System.out.println("Enter your choice:");
		Scanner sc=new Scanner(System.in); 
		choice=sc.nextInt();
		int ans=switch(choice)
		{ 
		   case 1:System.out.println("one");
		          yield 22; 
				  break;
			case 2:System.out.println("two");
		          yield 33;  
			default:yield 786 ;
		}; 
		
		System.out.println(ans);
		          
	}
}