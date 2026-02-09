public class constructorprogram
{
    int a;
    constructorprogram(){
        System.out.println("constrctor part"); //when u created the obj it will automatically call the constructor
    }
    public static void main(String[]args)
    {        
        
        constructorprogram obj=new constructorprogram();
        
        
        System.out.println(obj.a); //error: variable a might not have been initialized  
    }
}
