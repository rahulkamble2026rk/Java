// method overloading: this is the compiletime polymorphism 
// polymorphism : multiple forms , in  this compiletime polymorphism we have the multiple function defination and which are decides by the complier itself by looking at the datatype of the variable 
class pro2
{
	public static void main(String[]args)
	{  
         show(10);	
	}    
	 
	 static void show()
	 { 
	   
	 }
	 
	  static int show(int a)
	 { 
	   System.out.println("In the int show"); 
	   return 2;
	 }
	 
	 static void show(String str)
	 { 
	   
	 }
	
}