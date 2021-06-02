package p2;

import pkg.ClassA;

public class ClassB extends ClassA {
    protected int m = 10;

    public void displayB() {
        System.out.println("Class B");
        System.out.println("m = " + m);
    }

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        a.b = 5; // Public
        a.aa = 10; // protected
        a.c = 15; // private

        System.out.println(a.b);
        System.out.println(a.aa);

        // a.displayA();
        // b.displayB();
        // System.out.println("Hello world");
    }
}
