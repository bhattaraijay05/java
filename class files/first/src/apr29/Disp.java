class TwoD {
    int x, y;

    void diplay() {
        System.out.println("From the parent class");
        System.out.println("x : " + x + " Y : " + y);
    }
}

class ThreeD extends TwoD {
    int z;

    @Override
    void diplay() {
        super.diplay();
        System.out.println("From the derived class");
        System.out.println("x : " + x + " Y : " + y + " Z : " + z);
    }
}

class Disp {
    public static void main(String[] args) {
        ThreeD t1 = new ThreeD();
        t1.x = 21;
        t1.y = 25;
        t1.z = 28;
        t1.diplay();
    }
}