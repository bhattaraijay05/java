class demo1 {
    public static void main(String[] args) {

        // create a StringBuffer object
        // with a String pass as parameter
        StringBuffer str = new StringBuffer("bmscebangalore");
        System.out.println("String = " + str.toString());
        str.setCharAt(17, '0');
        System.out.println("After setCharAt() String = " + str.toString());
    }
}