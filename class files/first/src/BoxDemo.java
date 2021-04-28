class Box {
    int width;
    int height;
    int length;
    // boolean aa;
    // float bb;

    // double volume() {
    // double volume;
    // volume = height * length * width;
    // return volume;
    // }
    Box() {
        length = 12;
        width = 1;
        height = 7;

        double volume = height * length * width;
        System.out.println("The volume from the costructor is " + volume);
    }

    Box(Box b1) {
        length = b1.length;
        width = b1.width;
        height = b1.height;
    }

    Box(int l, int w, int h) {
        // length = l;
        // width = w;
        // height = h;
        this.length = l;
        this.width = w;
        this.height = h;
    }

    double volume() {
        double volume;
        volume = height * length * width;
        return volume;
    }

}

class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(10, 50, 20);
        Box b2 = new Box(3, 5, 7);
        Box b3 = new Box();

        Box b4 = new Box(b1);

        System.out.println(b1.volume());
        System.out.println(b2.volume());
        System.out.println(b3.volume());
        System.out.println(b4.volume());

        // Box b2 = b1;
        // Box b3 = new Box();
        // System.out.println("Width is " + b1.width);
        // System.out.println("Length is " + b1.aa);
        // System.out.println("float is " + b1.bb);
        // System.out.println("B1 is " + b1);

        // double volume1, volume2;

        // b1.height = 20;
        // b1.length = 30;
        // b1.width = 50;
        // b2.height = 7;
        // b2.length = 9;
        // b2.width = 8;

        // b1.volume();
        // b2.volume();
        // System.out.println(b1.volume());
        // System.out.println(b3.volume(50, 60, 20));

        // volume1 = b1.height * b1.length * b1.width;
        // volume2 = b1.height * b1.length * b1.width;

        // System.out.println("Volume : " + volume1);
        // System.out.println("Volume : " + volume2);
        // System.out.println(b1.height);
        // System.out.println(b2.height);
    }

}
