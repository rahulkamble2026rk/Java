public class pro14
{
    public static void main(String[]args)
    {
        //5.appned() : 
        StringBuffer str=new StringBuffer(); 
        System.out.println(str);
        str.append("Rahul is Good Boy"); 
        System.out.println(str); 

        //6.insert(index,string): konsi index pe char or string dalni hai 
        str.insert(2,"k"); 
        System.out.println(str); 


        //7.reverse: It reverse the characters of the string 
        str.reverse(); 
        System.out.println(str); 

        //8.delete: it delete the characters from the start index to end index 
        str.delete(0,5); 
        System.out.println(str); 

        //9.deleteCharAt(index): It delete the character at the specific index 
        str.deleteCharAt(0); 
        System.out.println(str); 

        //10.replace(start index,end index,"string/char") 
        str.replace(0,4,"India"); 
        System.out.println(str);

        //11.CharAt(index):  
       char ch= str.charAt(2); 
        System.out.println(ch); 


        //12.setChatAt(); 
        str.setCharAt(2,'D'); 
        System.out.println(str); 

    }
}