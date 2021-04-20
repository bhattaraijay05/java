class Box {
    int width;
    int height, length;

    double volume() {
        double volume;
        volume = height * length * width;
        return volume;
    }

    double volume(int width, int height, int length) {
        double volume;
        volume = height * length * width;
        return volume;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box();
        // Box b2 = b1;
        Box b2 = new Box();
        Box b3 = new Box();

        // double volume1, volume2;

        b1.height = 20;
        b1.length = 30;
        b1.width = 50;
        b2.height = 7;
        b2.length = 9;
        b2.width = 8;

        b1.volume();
        b2.volume();
        System.out.println(b1.volume());
        System.out.println(b3.volume(50, 60, 20));

        // volume1 = b1.height * b1.length * b1.width;
        // volume2 = b1.height * b1.length * b1.width;

        // System.out.println("Volume : " + volume1);
        // System.out.println("Volume : " + volume2);
        // System.out.println(b1.height);
        // System.out.println(b2.height);
    }

}
