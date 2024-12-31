/* how to stop the execution of the thread  we use the  
   i--> exit(0); 
   */
 
 class Mythread implements Runnable 
 { 
    public void run() 
	{ 
	    for(int i=1;i<=5;i++) 
		{ 
		    System.out.println("The current childThread in run() is:"+Thread.currentThread().getName()+" i= "+i);
		     System.exit(0);	
		}
	}
 } 
 class pro9
 {  
	public static void main(String[]args) 
	{ 
	    Mythread obj=new Mythread(); 
		
		
		Thread t=new Thread(obj,"One"); // there is formation of the thread t which will work for the obj object thread
		
		
		t.start(); 
       	
		try 
		{
		Thread.sleep(15000); 
		} 
		catch(InterruptedException ie) 
		{ 
		  System.out.println("caught");
		} 
		System.exit(0);
		System.out.println("main() ends"); 
		
	} 
 }