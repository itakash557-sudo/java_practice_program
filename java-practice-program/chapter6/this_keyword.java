//without using this keyword



 // public class this_keyword{
//     String a;
//     static this_keyword obj=new this_keyword(); 
    
//     void word(String a ){
//         System.out.println("function running");
//     }
//     public static void main(String[]args)
//     {
//         System.out.println(obj.a);
//         obj.word("hello"); //call only onside of a main
//     }
// }
 



//with using this keyword


public class this_keyword{

    String a;
    static this_keyword obj=new this_keyword(); 
    
    void word(String a ){
        this.a=a;
    }
    public static void main(String[]args)
    {
        System.out.println(obj.a); //before
        obj.word("hello"); //call only onside of a main
        System.out.println(obj.a);  //after 
    }
}
