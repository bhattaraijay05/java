import java.nio.charset.Charset;

class strings {
    public static void main(String Args[]) {
        // char c[] = { 'j', 'a', 'v', 'a' };
        // String s1 = new String(c);
        // String s2 = new String("s1");

        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());

        // byte[] b_arr = { 71, 101, 101, 107, 115 };
        // Charset cs = Charset.defaultCharset();
        // String s_byte_char = new String(b_arr, cs);
        // System.out.println(s_byte_char);

        // byte b[] = { 'a', 'b', 'c' };
        // try {
        // String s = new String(b, "US-ASCII");
        // System.out.println(s);
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        int age = 9;
        String s = "he is one of " + age + " years old army";
        String s1 = "four" + (2 + 2);
        System.out.println(s);
        System.out.println(s1);

    }
}