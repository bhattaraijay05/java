package apack;

public class A {
    public static int publicVar;
    protected static int protectedVar;
    private static int privateVar;
    static int defaultVar;

    public static void display() {
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("privateVar = " + privateVar);
        System.out.println("defaultVar = " + defaultVar);
    }
}