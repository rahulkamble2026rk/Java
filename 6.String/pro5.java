class pro5
{
    public static void main(String[] args) 
    {
       String str="HeLLO RK"; 
       System.out.println("Length if the string is :"+str.length());    //str.length() 
       //To get the chracter we use the diff. functios becuse we don't have the access by usingthe []  
       System.out.println("The character at the 6th position is :"+str.charAt(5)); //charAt is use for getting the only one characters 
       
       //for getting the multiple characters we use the getchars() and stroing those characrteres into antoher string
       char target[]=new char[20]; 
       String source="Good Morning";  
       source.getChars(2,7,target,3); 
    
       for(int i=3;i<target.length;i++)
       {
        System.out.println(target[i]);
       } 

       //getBytes , sometime we want the string in the bytes array 
       byte array[]=source.getBytes(); 
       for(int i = 0; i < array.length; i++)
       {
        System.out.println((char) array[i]);
       }
String str1="Rahul"; 
String str2="Rahul"; 
String str3=new String("Rahul"); 
if(str1==str2)
{
    System.out.println("Equal1");
} 
if(str2==str3)   //If we are directly comapring then there is comparison of the identityHashCode() means the address but if want to comare the string cotent then se the equals() 
{
    System.out.println("Equal2");
} 

if(str2.equals(str3)) 
{
    System.out.println("Equal by equals()");
}

if(str3.hashCode()==str2.hashCode())
  System.out.println("The content is same here by using the str.hashCode()"
  ); 


  //comapre the string by ignoring the uppercase or the lowercase by equalsignorecase() 
  String str4="RahuL"; 
if(str2.equalsIgnoreCase(str4))
{
      System.out.println("Here the content is comapre by ignoring the uppercase or lowercase");
    }
}
}