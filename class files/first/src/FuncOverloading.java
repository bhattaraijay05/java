public class FuncOverloading {
    void test() {
        System.out.println("Parameter is not given");
    }

    void test(int a) {
        System.out.println("The value of a is " + a);
    }

    void test(int a, int b) {
        System.out.println("Multiple is " + a * b);
    }

    double test(double a) {
        System.out.println("Double is " + a);
        return a * a;
    }

    public static void main(String[] args) {
        FuncOverloading a1 = new FuncOverloading();
        FuncOverloading a2 = new FuncOverloading();
        FuncOverloading a3 = new FuncOverloading();
        FuncOverloading a4 = new FuncOverloading();
        int a = 50;

        a1.test();
        a2.test(5);
        a3.test(7, 8);
        System.out.println(a4.test(5.2));
        // System.out.println(a4.test(a));
        a4.test(a);
    }

}
