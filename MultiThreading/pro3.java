/*Rule's for creating the our own thread 
  
  Rule 1: Creating our own class which can extends Thread class or implements Runnable class  
  Rule 2: In both class there is presence of the run() method from which the execution of the child thread is gets starts(run() method is working as the entrypoint for the child thread ), it is compusolry that override then run method during by at the time of the implments 
  Rule 3: for executing the run() method we have to call the start() method, but if we still call the run directly then there is exection/work of the main thread and not by using the child thread 
*/  
class Myclass implements Runnable
{
	 public void run() 
	 { 
	   System.out.println("Hello Thread & Name of the thread is: "+Thread.currentThread().getName());
	 }
} 
class pro3 
{
	public static void main(String[]args) 
	{
		Myclass obj=new Myclass();
		Thread t=new Thread(obj);  // ---> Default constructor to pass as parameter , out thread will work for the obj object only  

        System.out.println("The name of the thread :" +t.getName()); 
		
        Thread ref= new Thread(obj,"small");		 // Parametersied construnctor , which takes the parameters as object & name of the thread as string 
	    System.out.println("The name of the thread as (parameterised constructor):" +ref.getName());  
		
		//ref.start();  
		// ref.run() ; 
		 //t.run(); 
		 t.start();
		 System.out.println("The name of the thread is after start():" +Thread.currentThread().getName()); 
		
	}
}	
		