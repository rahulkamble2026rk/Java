class pro6
{
    public static void main(String[]args)
    {
        //region mathcers: this method is use for the compare teh pecfic region insie teh sting with the another string this is nonstatic member fucntion 
        boolean result;  
        String str="Hello Rahul";
        String str1="Hello Rahul How are you"; 
        String str2="you"; 
        String str3="zou";
        //1.
        result=str.regionMatches(0, str1, 0, str1.length()); //str1.startindex,str2,str2.startindex,numberof charas 
        //2.startWith(): this checks whthetr the string is starting with the specfic string or not , returns true/false  

        result=str1.startsWith(str);
         
        //3.endsWith(): this checks whether the string is ending with the particular stringn or not 
        result=str1.endsWith(str2);
         
        //4.compareTo(): This method is use to compare the characters alphabetically fromm the string(lexographically), this  is mainly used for the comparsion of the string whether which string is greater or which string is less, and it retuen the result in the integer
        int ans;
        ans=str2.compareTo(str3);
        System.out.println(ans);
    
    }
} 

//summery: 
// 1.str.regionMatches(); 
// 2.str.startWith(); 
// 3.str.endsWith();
// 3.str.compareTo(): //this returns the index of the mathcing  
