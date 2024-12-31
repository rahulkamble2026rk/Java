class pro2  
{ 
public static void main(String [] args)
 {
  String str=new String("Hello4"); 
  System.out.println("the Ref. of the str:-> "+System.identityHashCode(str));  //tbis both are priting the ref. of the string which is passed as the parameter as string on the heap  
  String temp2="Hello4"; 
  System.out.println("The Ref. if the temp:->"+System.identityHashCode(temp2));  
  System.out.println("The Hashcode of the temp is :"+temp2.hashCode()); 
  System.out.println("The Hashcode of the str is :"+str.hashCode());

 }
} 
//If you assign the string diretlly then the System.identityHashCode of the string are same, but uif you do it by using yhe new String("") then that will not be same  , here teh address or memory location take into matter
//If you assing the string direcly or by using the new String("") then also the str.hashCode() of hte both strings will be same , because the hashCode is looking for the content of the string and not for the ref. or address
