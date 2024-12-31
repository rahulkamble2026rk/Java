public class pro10
{
    public static void main(String[]args)
    {
        //string modification functuion: As we know that we cannot modify the string because the string are immutable so once any string is made we amde any chnage then new memory and content will be allocated and the previous content is saved i teh stringpool , so the memory of the java will save 
        //so here modificaion means creating/fomration ofthe new string 
         
        //1.substring();this function is usd for the extracting teh substring fro the invoking string : str.substring(int startindex), str.substring(int startindex,int endindex)
         
          String str="Good morning india"; 
          String newstring=str.substring(0,4); //  goes upto endindex-1(index starts from 0)
          System.out.println(newstring); 
           
          //2.concat():this function is used for the concation of the string
          String newstr=str.concat("-From DD news India"); 
          System.out.println(newstr); 

          //3.replace(): this replace the string or the character from the string and return the modified one 
          newstr=str.replace("Good","Bad"); 
          System.out.println(newstr); 

          //4.trim():it is use for the removing teh trailing and leading space from the string and returns the new string 
           str="  Hello Rahul ";
          newstr=str.trim(); 
          System.out.println(newstr); 

          //5.toUpperCase(): converts all lowercase aplhabets and returns new string in uppercase 
          newstr=str.toUpperCase(); 
          System.out.println(newstr); 

          ///6.toLowerCase():convert the all Uppercase to Lowercase and return new string 
          newstr=str.toLowerCase(); 
          System.out.println(newstr); 

          //7.spilt():this splits the stirng from a particular string or character and return a array of the multiple substring 
          str="Good Morning Ind";
          String arr[]; 
          arr=str.split(" "); 
          System.out.println("We are spliiting the string");
          for(String w:arr)
          {
            System.out.println(w);
          }

    }

}