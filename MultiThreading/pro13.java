class Container 
{
  int number;
  boolean flag; 
  Container()
  { 
   
  } 
public void produce(int temp)
{ 
number=temp; 
System.out.println("Producer produce "+number);
flag=true;
} 
public void consume()
{ 
  System.out.println("Consumer consume "+number);
  flag=false;
}	
  
}
class Producer  extends Thread
{  
   Thread t;
   Container ref;
   Producer(Container temp)
   { 
     ref=temp;
	 t=new Thread(this,"Consumer");
   } 
   public void run()
   { 
         int i=1;
		 while(true)
		 { 
	           if(ref.flag==false)
			   {
			 ref.produce(i); 
			   } 
			   else 
			   { 
		        System.out.println("Polling by Producer");
			   }   
			   i++;
			   
		 }
   } 
   public void startThread()
   { 
      t.start();
   }
} 
class Consumer  extends Thread
{  
   Container ref;
   Thread t;
  Consumer(Container temp)
  { 
    ref=temp;
	t=new Thread(this,"Producer");
  } 
  public void run()
  { 
    int i=1;
    while(true)
		 { 
	           if(ref.flag==true)
			   {
			 ref.consume(); 
			   } 
			   else 
			   { 
		        System.out.println("Polling by Producer");
			   }   
			   i++;
			   
		 }
  } 
   public void startThread()
   { 
      t.start();
   }
}
class pro13  
{
	public static void main(String[]args)
	{
		Container ct=new Container();
		Producer pro=new Producer(ct); 
		Consumer con=new Consumer(ct); 
		
		pro.startThread();
		con.startThread(); 
		try
		{
		Thread.sleep(400);  
		}
		catch(InterruptedException ie)
		{ 
		   
		}
		System.exit(0);
	}
}