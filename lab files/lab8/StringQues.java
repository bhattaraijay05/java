class StringQues {

    // @Override
    public static String toString(int stri) {
        return "Good Morning";
    }

    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String str = new String(arr, 2, 3);
        System.out.println(str);

        String s1 = "Hello World";
        String s2 = "Hello World";
        String str1 = new String("Hello World ");
        String str2 = new String("Bms College");
        String str3 = new String("Hello World ");

        System.out.println(toString(1));

        System.out.println(str1.concat(str2));

        System.out.println(str1 == str2);
        System.out.println(str1.compareTo(str3));
        System.out.println(s1 == s2);

        String ss1 = "good morning";
        String ss2 = "morning is started";

        System.out.println(ss2.contains(ss1));
        System.out.println(ss2.indexOf("morning"));

        System.out.println(s1.replace("Hello", "Greeting"));

        String sss1 = "Hello BMSCE Good Morning";
        System.out.println(sss1.replaceAll(" ", ""));

        String[] d1 = { "xyz", "24" };
        System.out.println(d1[0] + "@gmail.com");
        System.out.println(d1[1] + "56235412");

        // @Override
        // void toString(string) {
        // System.out.println(string);
        // }

        // System.out.println(toString("Good Morning"));

    }
}
