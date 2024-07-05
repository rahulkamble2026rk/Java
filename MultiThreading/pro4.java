class Mythread implements Runnable 
{ 
   int x; 
   Runnable task; 
   
     public void run() 
	 {
	  System.out.println("The name of the currentThread in run() method is :"+Thread.currentThread().getName());
	 }
	Mythread() 
	{ 
	
	}
   Mythread(Runnable r) 
   { 
      task=r;
   } 
   
} 
 
class pro4 
{
	public static void main(String[]args) 
	{
		Mythread obj=new Mythread();
		Thread t=new Thread(obj,"Harry");   // --> This is the formation of the Thread t which will work for the obj object 
		 
		System.out.println("The Current Thread is :"+Thread.currentThread().getName());
	    t.start();           // --> firstly start() method will excute by the thread t and then run() method will execute by the child thread 
	}
}