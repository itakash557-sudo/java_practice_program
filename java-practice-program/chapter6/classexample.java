public class classexample{
    public static void main (String [] args)
    {
        class student{
            String name; //variable 1
            int id; //variable 2
        }
        student st =new student(); //creating a obj 1
        st.name="Akash"; //assigning a value to the variable using object
        st.id=002;
        System.out.println("Name of the Student:"+st.name); //st.name need to but the obj name because u r in a main class it may have name obj
        System.out.println("Student id:"+st.id);

        //object two
        student st2=new student();
        st2.name="developer";
        System.out.println("Name of the Student:"+st2.name);
    }
}


