class pro2 
{
	public static void main(String[]args) 
	{
		Thread t;
		t=Thread.currentThread();
	    System.out.println(t); 
	    // to getting the id of the thread use the threadId() 
		System.out.println("The id of the thread is the "+t.threadId()); 
		 
		// to getting the threadName() and setting the threadName() use the  
		System.out.println("The Name of the thread is: "+t.getName()); 
		  
		t.setName("Rahul"); 
		System.out.println("The Name of the thread is: "+t.getName());  
		
		// to getting the priority use the getPriority 
		 System.out.println("The priority of the thread is: "+t.getPriority());  
		 
		// to setting the priority use of the setPriority  
		t.setPriority(7); 
		
		System.out.println("The new priority of the thread is: "+t.getPriority());   
		
		 
		 
	}
}
		 