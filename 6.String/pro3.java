 class pro3 
 {
    public static void main(String[] args) {
        String str="Java"; 
        System.out.println("Hashcode od the str:" +str.hashCode()); 
        str=str+"is good";  
        System.out.println("Hashcode od the str:" +str.hashCode()); 
        
    }
}
//java is immuatble means after the formation of the string we cannot do the like 
// str="Hello"
//str[0]='B'; this us niot possible in the java but possible in teh cpp  
// if any change is occurs in teh string then theere will be formationn of the new string and the previous strin will be store in the string pool , java store the previous string because to avoid the wastage of the memory 
