 //StringBuffer: StringBuffer is the constructor which is use to create and initlaize the StringBuffer  
//              :It modifies the String without creating te new object of the stirng 
//              :we can insert the nwe data during the process inn the string  

public class pro11
{
    public static void main(String[]args)
    {
        String str="Hello"; 
        String newstr=str.concat(" World"); 
        System.out.println("newstr: "+newstr);  
        System.out.println("str:"+str); 


        StringBuffer str2=new StringBuffer("Hello");  
        System.out.println("First String with String Buffer -> "+str2); 
        str2.append(" World");   ///here modification inn stringwhich is already presernt
        System.out.println("Modified String with the String Buffer-> "+str2);

    }
}