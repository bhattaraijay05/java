// import java.util.Arrays;
// import java.util.List;

// class Example {
//     public static void main(String[] args) {
//         String str[] = { "Apple", "Banana" };
//         List<String> l = Arrays.asList(str);
//         System.out.println(l);

//         // It will throw java.lang.UnsupportedOperationException

//         l.add("Mango");
//     }
// }

import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Example {

    public static void main(String[] args) {

        String str[] = { "Apple", "Banana" };
        List<String> list = Arrays.asList(str);

        List<String> l = new ArrayList<>(list);

        l.add("Mango"); // modify the list

        for (String s : l)
            System.out.println(s);

    }

}
