import java.util.*; 
class pro7
{
    public static void main(String[]args)
    { 
        //array of the string 
        String []arr=new String[3]; 
        Scanner sc=new Scanner(System.in); 
        for(int i=0;i<3;i++)
        { 
            String temp;  
            System.out.println("Enter the "+(i+1)+" stringh");
            // temp=sc.nextLine();
            // arr[i]=new String(temp); '
            arr[i]=sc.nextLine();
        }  

        for(int i=0;i<3;i++)
        {
            System.out.println(arr[i]+" ");
        }

    }
}