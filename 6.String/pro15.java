public class pro15 {
    public static void main(String[]args)
    {
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        } 

        //conversion of the string(containng the numeric)to Integer by using the Integer.parseInt(): 
       String str="110";
        int num=Integer.parseInt(str); 
        System.out.println(num);
    }
}
