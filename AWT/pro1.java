// how to use the windowopearation and mouseopeartion by using the awt 
// important parameters that take into consideration are the:
/* 
  ** 
  1.Event Source: on which this process is get occurs 
  2.Event       : this is nothing but the activity 
  3.Event Listener :this is nothing but a class that we define by extending with the given listener  
  4.process of registration .  
  ******** 
  1> Every time the we cannot override all mehtods in the case of the interface in that time use the class like windowAdpater, mouseAdapter etc which provides you specfic method which you want*/ 
  
  */
 
 import java.awt.*; 
import java .awt.event.*;
class Myframe extends Frame implements Runnable 
{
	Myframe(MyWindowListner var)   // here the frame is working as the Event source 
	{  
	
	  setSize(500,500); 
	  setLocationRelativeTo(null);
	  setTitle("This is my first Window");
	  setVisible(true); //this is the most important one 
	  setBackground(Color.GRAY);  
	 
	  // we have to the last step which is the registration of the Event source with the Event Listener by : Event_source.addTypeListener(TypeListener object) 
	  this.addWindowListener(var);
	}  
	public void run()
	{ 
	   System.out.println("The name of the current Thread is:"+Thread.currentThread().getName());
	} 
	 
}
class pro1 
{
	public static void main(String[]args)
	{  
	    MyWindowListner var=new MyWindowListner();
		Myframe obj=new Myframe(var);  
		Thread t=new Thread(obj,"obj"); 
		t.start();
        System.out.println("main()ends");		
	}
} 
class MyWindowListner implements WindowListener  // to get the understand the compiler which is the EventListener we implements the WindowListener
{
	  @Override
    public void windowOpened(WindowEvent e) {}

    @Override
    public void windowClosing(WindowEvent e)  
	{
        System.out.println("Window closing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
} 
// here WindowListener is the interface ,because at the time of the creation of this concept the java developer doest not known about anything that what will be the future code so they declared as the interface 
