
abstract class Shape {
    abstract void display();
}

interface IPoint {
    public void displayPoint();
}

class Triangle extends Shape implements IPoint {
    void display() {
        System.out.println("I am triangle shape");
    }

    public void displayPoint() {
        System.out.println("Triangle with point = 3");
    }
}

class Hexagon extends Shape implements IPoint {
    void display() {
        System.out.println("I am hexagon shape");
    }

    public void displayPoint() {
        System.out.println("Hexagon with point = 6");
    }
}

class Circle extends Shape {
    void display() {
        System.out.println("I am circle shape");
    }
}

class ThreeDCircle extends Circle {
    void display() {
        super.display();
        System.out.println("I am a 3d Circle");
    }

}

public class TwoC {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.display();
        t1.displayPoint();

        Hexagon h1 = new Hexagon();
        h1.display();
        h1.displayPoint();

        Circle c1 = new Circle();
        c1.display();

        ThreeDCircle cc1 = new ThreeDCircle();
        cc1.display();
    }

}