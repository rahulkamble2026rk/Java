public class pro12 {
    public static void main(String[] args) 
    {  
        //Fucntion in the StringBuffer
        //1.capacity(); 
        //2.Lenght();This is showing ht e Current size of the STringBuffer  

        StringBuffer str=new StringBuffer(); 
        System.out.println("Capacity is:-> "+str.capacity()); 
        System.out.println("Length is:"+str.length());  
        
         
         str=new StringBuffer(30); 
        System.out.println("Capacity is:-> "+str.capacity()); 
        System.out.println("Length is:"+str.length());   

        str=new StringBuffer("Hello"); 
        System.out.println("Capacity is:-> "+str.capacity()); //it just shows the capacity not he remaining space
        System.out.println("Length is:"+str.length());
    }
}
