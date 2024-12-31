class Mythread extends Thread  
{
    
    static int x=1;
    public void run()  
	{
       for(int i=1;i<=10;i++)
	   { 
         System.out.prinln(x); 
		 x++;
	   }
    }
}

class pro11 {
    public static void main(String[] args) {

        Mythread obj1 = new Mythread();
        Mythread obj2 = new Mythread();

        Thread t1 = new Thread(obj1, "ONE");
        Thread t2 = new Thread(obj2, "TWO");

   
        t1.start();
        t2.start();

     
        System.out.println("main () ends");
    }
}
