class Vechicle {
    String name;
    int year;

    void display() {
        System.out.println("The vehicle is " + name + " and is established in year " + year);
    }

}

class Car extends Vechicle {

    Car(String n, int y) {
        name = n;
        year = y;
    }

    @Override
    void display() {
        System.out.println("...Car Detail...");
        super.display();
    }
}

class Bike extends Vechicle {
    Bike(String n, int y) {
        name = n;
        year = y;
    }

    @Override
    void display() {
        System.out.println("\n...Bike Detail...");
        super.display();
    }
}

public class Veh {
    public static void main(String[] args) {
        Car c1 = new Car("Bugatti", 1989);
        c1.display();
        Bike b1 = new Bike("Honda", 2001);
        b1.display();
    }
}
