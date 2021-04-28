
// Identify the type of inheritance in the given diagram. Create a class A with two integer member variables that are private, two float variables that are protected and two integer variables that are public. Let class B inherit class A and class C and Class D are inherited from class B. Write appropriate methods to illustrate the following
// i)	Usage of super keyword
// ii)	Function overriding
// iii)	Default constructors
// iv)	Parameterized constructors
// v)make a method not to be over ridden and a class not be inherited further

class A {
    private int a, b;
    protected float c, d;
    public int e, f;

    A() {
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

}

class B extends A {
    B(float i, float j, int k, int l) {
        c = i;
        d = j;
        e = k;
        f = l;
    }

    B() {
    };

    @Override
    void display() {
        System.out.println("From B");
        super.display();
    }
}

class C extends B {
    C(float i, float j, int k, int l) {
        c = i;
        d = j;
        e = k;
        f = l;
    }

    @Override
    void display() {
        System.out.println("From C");
        super.display();
    }
}

class D extends B {
    D(float i, float j, int k, int l) {
        c = i;
        d = j;
        e = k;
        f = l;
    }

    D() {
    }

    @Override
    void display() {
        System.out.println("From D");
        super.display();
    }
}

public class Data {
    public static void main(String[] args) {
        A a1 = new A(1, 2, 3, 2, 7, 8);
        a1.display();
        B b1 = new B(3, 2, 7, 8);
        b1.display();
        C c1 = new C(1, 2, 3, 2);
        c1.display();
        D d1 = new D(1, 2, 3, 8);
        d1.display();
        D d2 = new D();
        d2.display();
    }
}