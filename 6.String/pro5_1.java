

//valueof(): this is used for the to covert the non-String element into hte string , at the concating also this method is gets called automatically 

public class pro5_1  
{
    public static void main(String[]args)
    {
         String str; 
        //  str=10; --> Error  
        str=String.valueOf(10); 
         System.out.println(str); 
         str="Good Morning India This is "+10; 
         System.out.println(str);
        

    }    
}
