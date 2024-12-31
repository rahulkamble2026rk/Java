class pro1
{ 
   public static void main(String[]args)
   {  
      String str="Hello";  
     /* 
      while(str[i]!='/0')
      {
         System.out.println(str[i]);
      }
      System.out.println(str[i]);    1)  this is not allowed in java 
       
      */  
      //ways to creating the String 
      //1.directly assinging the string 
      String temp="Rahul is the good boy"; 
      System.out.println(temp); 

      //2.by using assinging the one ref. to another one 
      String str1=temp; 
      System.out.println(str1); 

      //as the string is hte object in the java so the ref. will be on the stack buy the  string will on the hedp 

      //3.by using yhe new operator 
      String temp2=new String("Good Morning India"); 
      System.out.println(temp2); 

      //4.by using yhr character array 
      char ch[]={'R','A','H','U','L'}; 
      String tempstring=new String(ch); 
      System.out.println("New string is:"+tempstring);
      
      //5.by using the bytes array 
      byte by[]={'H','e','l','l','o'}; 
      String newstring=new String(by); 
      System.out.println("string by using teh bytes array:"+by);
      
   }
   
}