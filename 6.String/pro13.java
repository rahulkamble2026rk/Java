public class pro13 {
    public static void main(String[] args) 
    {  
        //Fucntion in the StringBuffer
        //3.ensurecapacity(); It is used to ensure that the buffer has enough capacity to hold a specified number of characters without reallocating memory. 
        //                  means once our memory is get's full then the StringBuffer allocates more memory by using the formula : (CurrentCapacity*2)+2, everytime sysytem have to do this after getting the full buffer , and reallocation/resize is expensive process because 1.Allocating new memory.
                                                                                                                                                                                                                                                                                //2. Copying all existing characters to the new buffer.
                                                                                                                                                                                                                                                                                 //3. Adding new characters.

        StringBuffer str=new StringBuffer(); 
        System.out.println("Capacity is:-> "+str.capacity()); 
        System.out.println("Length is:"+str.length());  
          

         // Ensure enough capacity to avoid resizing in the loop
         str.ensureCapacity(50);  // Pre-allocate space for at least 50 characters 

        for(int i=0;i<20;i++)
         {
            str.append(i);  //Due the nore capcaity than currnet Bufffer StringBuffer increased the size by using the (CurrentCapcity*2)+2
         }
         System.out.println("Length is:"+str.length()); 
         System.out.println("Capacity is:-> "+str.capacity());  
    



         //4.setLength(number):  
         StringBuffer bs=new StringBuffer("Hello Good Morning India,This is RK");
          bs.setLength(5); 
        //Truncate Strings without creating new objects.
        //  Extend the buffer for future use without appending characters manually.
        //  Efficient way to clear the buffer by setting the length to 0
         System.out.println("capacity of the string:"+str.capacity());
         System.out.println("Lenght of the String:"+bs.length()); 
         System.out.println(bs); 

         bs.setLength(0);
         System.out.println(bs);   //Thus us the simple way to trucate any stringbuffer
    }
} 
