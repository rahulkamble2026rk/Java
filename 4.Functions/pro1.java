
/* 1.we directly call the static function from one static function , nut we can't call the snon-static function from the static fucntion directly but we call via object and (.) opearattor  

*/
class pro1
{ 
    int x;
	public static void main(String[]args)
	{   
	    pro1 obj=new pro1(); 
	    obj.show();
	    
	} 
	static void show()
	{  
	  
	 
	  System.out.println("show"); 
	 
	}
    void rk()
	{
		System.out.println("Rahul");
	}
	
	 
} 
