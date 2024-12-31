// 2> isAlive(): this is the nonstatic method , this method tells whether the current thread isAlive() or not  
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
		  
	  } 
       
     
	}
	
} 

class pro7
{
	public static void main(String[]args) 
	{
		Mythread var1=new Mythread();  
		Mythread var2=new Mythread();
		
		Thread t1=new Thread(var1,"One"); // here the t1 will work for the var1 object and t2 will work for the var2 object  
		Thread t2=new Thread(var2,"Two"); 
		 
		int i=1; 
		t1.start();
		while(t1.isAlive()==true) // this means , zab tak t1 thread ke zaryes
		{ 
	         System.out.println(i);
			 i++;
		}
	     
	     i=1; 
		t2.start();
		while(t2.isAlive()==true) // this means , zab tak t1 thread ke zaryes
		{ 
	         System.out.println(i);
			 i++;
		} 
		
		System.out.println("main() ends");
	}
}
		