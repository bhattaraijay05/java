// Create a string using StringBuffer class and perform the following operations :
// i) change the char of a string at a given position
// ii) change the length of the string
// iii) insert a substring at a particular position
// iv) delete a substring
// v) differentiate between length() and capacity()

import java.lang.StringBuffer;

public class St {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("JavaProgramming");

        // change the char of a string at a given position
        sb.setCharAt(5, 'a');
        System.out.println("After changing the char at position 5 to 'a'");
        System.out.println(sb);

        // change the length of the string
        sb.setLength(10);
        System.out.println(sb);

        // insert a substring at a particular position
        sb.insert(5, "Hello");
        System.out.println(sb);

        // delete a substring
        sb.delete(5, 10);
        System.out.println(sb);

        // differentiate between length() and capacity()
        System.out.println("Length " + sb.length());
        System.out.println("Capacity " + sb.capacity());

    }
}
