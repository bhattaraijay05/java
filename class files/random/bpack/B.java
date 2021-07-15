package bpack;

import apack.*;

public class B extends A {
    public static void display() {
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        // System.out.println("privateVar = " + privateVar);
        // System.out.println("defaultVar = " + defaultVar);
    }
}