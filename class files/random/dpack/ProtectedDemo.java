package dpack;

import cpack.*;
import bpack.*;

public class ProtectedDemo {
    public static void main(String[] args) {
        B b = new B();
        b.publicVar = 10;
        // b.protectedVar = 20;
        // b.privateVar = 30;
        // b.defaultVar = 40;
        b.display();

        C c = new C();
        c.display();
    }
}
