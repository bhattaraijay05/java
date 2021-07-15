package cpack;

import apack.*;

public class C {
    public static void display() {
        A a = new A();
        a.publicVar = 10;
        // a.protectedVar = 20;
        // a.privateVar = 30;
        // a.defaultVar = 40;
        a.display();
    }
}