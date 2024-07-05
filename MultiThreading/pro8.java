/* 3>join(): this method is wait untill the thread terminates on which it is called due to this 
           : final void join() throws InterruptedException() 
		     the join will become final and it will throws an exception 
			*/ 
 
class Mythread extends Thread 
{ 
   
	 public void run() 
	 {       
	 
			for(int i=1;i<=5;i++) 
			{ 
		      System.out.println("The current childThread in run() is:"+Thread.currentThread().getName()+" i= "+i);
			}
	  }
} 
 
class pro8
{
	public static void main(String[]args) throws InterruptedException
	{
		Mythread obj1=new Mythread(); 
		Mythread obj2=new Mythread(); 
		
		Thread t1=new Thread(obj1,"One"); // there is formation of the thread t which will work for the obj object thread
		Thread t2=new Thread(obj2,"Two");
		
		t1.start();  
		t1.join();
		t2.start(); 
		t2.join();
		System.out.println("main() ends");
		
	}
}