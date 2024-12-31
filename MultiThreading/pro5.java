// to controlling the multiple threads there is the use of the some methods 
// 1> sleep() method: 
class Mythread implements Runnable 
{
	int x; 
	Mythread() 
	{ 
	  x=0;
	} 
	
	Mythread(int y) 
	{ 
	  x=y;
	}  
	
	public void run() 
	{ 
	  System.out.println("The Name of the currentThread is :"+Thread.currentThread().getName()); 
	  int i;
	  
	  for(i=1;i<=5;i++) 
	  { 
         System.out.println(Thread.currentThread().getName()+" i="+i);  
		  try 
		{	  
			Thread.sleep(500);
		} 
		catch(InterruptedException ie) 
		{ 
			System.out.println("caught");
		}
	  } 
       
     
	}
	
} 

class pro5 
{
	public static void main(String[]args) 
	{
		Mythread var1=new Mythread();  
		Mythread var2=new Mythread();
		
		Thread t1=new Thread(var1,"One"); // here the t1 will work for the var1 object and t2 will work for the var2 object  
		Thread t2=new Thread(var2,"Two"); 
		
		t1.start(); 
	     try
		 {
	     Thread.sleep(2600); 
		 } 
		 catch(InterruptedException ie) 
		 {  
		   System.out.println("caught");
		 }
		t2.start();  
		 
	}
}
		