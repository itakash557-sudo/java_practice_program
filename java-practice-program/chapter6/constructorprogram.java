class constructorprogram{
    public static void main (String[]args)
    {
        System.out.println("this is constructor program");
        box bx=new box();
        System.out.println(bx); //once the obj is created then use it the obj atleast onces

    }
}
class box
{  // Constructor (same name as class)
    box()
    {
        System.out.println("running");
        
    }
}

class measure{
    double length,height,weight;
    {
        measure(double l ,double h,double w)
        {
            length=l;

        }
    }
        
    
}