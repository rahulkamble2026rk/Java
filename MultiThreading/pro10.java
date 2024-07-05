// By using the 
class Mythread extends Thread 
{
	boolan value=true;
	
	public void run()
	{
		while(true)
		{
			System.out.println("hello");
		}
	} 
}  

class pro10 
{
	public static void main(String[]args)
	{
		Mythread obj=new Mythread();
		Thread t=new Thread(obj);
		
		t.start();
		Thread.sleep(5000); 
		System.out.println("main thread resume"); 
		var.value=false;  
		System.out.prinln("some more code exeute");
		
		
	}
}