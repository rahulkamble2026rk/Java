import java.util.Scanner; 

class pro8
{
    public static void main(String[]args)
    {
        //scan 6 cityname and check pune 
        String [] city=new String[6]; 
        Scanner sc=new Scanner(System.in); 
        for(int i=0;i<city.length;i++)
        {  
            System.out.println("Enter the "+(i+1)+" string");
            city[i]=sc.nextLine();
        } 
        
        int i=0;
        for(i=0;i<city.length;i++)
        {
            if(city[i].equalsIgnoreCase("Pune"))
            {
                System.out.println("Pune is found"); 
                break;
            }                                                                                                                                                                                                                                                                                                           
            
        }  

        if(i==city.length)
        {
            System.out.println("Pune is not found");
        }

    }
}