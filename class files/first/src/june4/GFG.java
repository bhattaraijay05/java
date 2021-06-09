// import java.io.*;

// class GFG {
//     public static void main(String[] args) {
//         Class temp = Class.forName("gfg");
//         // Calling the clas gfg which is not present in the
//         // current class temp instance of calling class it
//         // will throw ClassNotFoundException;
//     }
// }


import java.io.*;
public class GFG {
  
    public static void main(String[] args)
        throws ClassNotFoundException
    {
  
        try {
            Class temp = Class.forName(
                "gfg"); // calling the gfg class
        }
        catch (ClassNotFoundException e) {
            // block executes when mention exception occur
            System.out.println(
                "Class does not exist check the name of the class");
        }
    }
}