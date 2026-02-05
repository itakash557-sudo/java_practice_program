public class methodprogram
{
    /* static void add(int a,int b){  //if u use static u don't need to create a object
            System.out.println(a+b);
        }
    public static void main(String []args)
    {
        int a=10;
        int b=20;
        add(10,20);
    } */
//    void sub(int a,int b){      //if u use void then u need to create object
//     System.out.println(a-b);
//    }
//    public static void main(String []args)
//    {
//     methodprogram obj=new methodprogram(); //creating the object
//     int a=10;
//     int b=20;
//     obj.sub(10,20);
//    }
 static int add(int a,int b){  
            return(a+b); //using return value it store the value then it take decision print or not 
        }
    public static void main(String []args)
    {
        int a=10; //need to initialize the datatype inside the main and outside of main
        int b=20;
        int result=add(10,20);
        System.out.println(result);
    }    

}



