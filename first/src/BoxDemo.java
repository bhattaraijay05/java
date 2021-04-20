class Box {
    int width, height, length;
}

class BoxDemo {
    public static void main(String[] args) {
        Box b = new Box();
        double volume;
        b.height = 20;
        b.length = 30;
        b.width = 50;
        volume = b.height * b.length * b.width;

        System.out.println("Volume : " + volume);
    }

}
