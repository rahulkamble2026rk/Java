class pro4 
{
    String model; 
    int year; 

    public pro4(String model,int year)
    {
        this.model=model; 
        this.year=year;
    } 
    public static void main(String[]args)
    {
        pro4 mycar=new pro4("ODDI",2024); 
        System.out.println(mycar);   //When we print the object then intenally it calls the all infomation of the object , means internally it call tostring()
    }
}

//toString() is used for the printing the object as the string