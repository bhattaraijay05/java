
// Identify the type of inheritance in the given diagram. Create a class A with two integer member variables that are private, two float variables that are protected and two integer variables that are public. Let class B inherit class A and class C and Class D are inherited from class B. Write appropriate methods to illustrate the following
// i)	Usage of super keyword
// ii)	Function overriding
// iii)	Default constructors
// iv)	Parameterized constructors
// v)   make a method not to be over ridden and a class not be inherited further

class A {
    private int a, b;
    protected float c, d;
    public int e, f;

    A() {
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = 6;
    }

    A(int g, int h, float i, float j, int k, int l) {
        a = g;
        b = h;
        c = i;
        d = j;
        e = k;
        f = l;
    }

    void display() {
        System.out.println("A : " + a);
        System.out.println("B : " + b);
        System.out.println("C : " + c);
        System.out.println("D : " + d);
        System.out.println("E : " + e);
        System.out.println("F : " + f);
    }

    void notOverriden() {
        System.out.println("This method will not be overridden after B");
    }

}

class B extends A {
    B(float i, float j, int k, int l) {
        c = i;
        d = j;
        e = k;
        f = l;
    }

    B() {
        super();
        e = 9;
        f = 10;
    };

    @Override
    void display() {
        System.out.println("From B");
        // System.out.println("C : " + a);
        System.out.println("C : " + c);
        System.out.println("D : " + d);
        System.out.println("E : " + e);
        System.out.println("F : " + f);
    }

    @Override
    final void notOverriden() {
        System.out.println("This method will not be overridden after B");
    }
}

class C extends B {
    C(float i, float j, int k, int l) {
        c = i;
        d = j;
        e = k;
        f = l;
    }

    C() {
        c = 25;
        e = 15;
        f = 10;
    }

    @Override
    void display() {
        System.out.println("From C");
        System.out.println("C : " + c);
        System.out.println("D : " + d);
        System.out.println("E : " + e);
        System.out.println("F : " + f);
    }

    // void notOverriden() {
    // System.out.println("This method is not overridden");
    // }
}

class D extends B {
    D(float i, float j, int k, int l) {
        c = i;
        d = j;
        e = k;
        f = l;
    }

    D() {
        super();
    }

    @Override
    void display() {
        System.out.println("From D");
        System.out.println("C : " + c);
        System.out.println("D : " + d);
        System.out.println("E : " + e);
        System.out.println("F : " + f);
    }
}

public class Data {
    public static void main(String[] args) {

        System.out.println("\nparameterized Constructor");
        A a2 = new A(1, 2, 3, 2, 7, 8);
        a2.display();
        B b2 = new B(3, 2, 7, 8);
        b2.display();
        C c2 = new C(1, 5, 3, 9);
        c2.display();
        D d2 = new D(1, 2, 3, 8);
        d2.display();
    }
}