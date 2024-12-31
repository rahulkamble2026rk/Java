public class pro9 { 
    public static void main(String[]args)
    {
        //seraching function in the java 
        //1.indexof(): this is the non-static function , which returns the first occurance inde of the particular string , if not found it return -1
        String str="Hello Good Morning RK,Hello India"; 
        int res=str.indexOf("Hello",1);  
        
        res=str.indexOf("By");
        System.out.println("The First occurance of the Hello string is "+res);  
          //1.lastindexof(): this is the non-static function , which returns the last occurance inde of the particular string 
        int ind=str.lastIndexOf("Hello"); 
        System.out.println("The last occuracnce indexof the Hello string is "+ind);
    }
    
}
