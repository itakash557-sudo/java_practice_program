public class classexample {
    public static void main (String [] args)
    {
        class student{
            String name; //variable_1 
            int id; //variable_2 
        }
        student st =new student(); //creating a obj 1
        st.name="Akash"; //assigning a value to the variable using object
        st.id=002;
        System.out.println("Name of the Student:"+st.name); //st.name need to but the obj name because u r in a main class it may have name obj
        System.out.println("Student id:"+st.id);

        //object two
        student st2=new student(); //creating a another object
        st2.name="developer";
        System.out.println("Name of the Student:"+st2.name);
    }
}







