
// 1b.Write a class named Car that has the following data members:
// • model. The model field is an int that holds the car’s year.
// • make. The make field references a String object that holds the make of the car.
// • speed. The speed field is an int that holds the car’s current speed.

// The class should have the following constructor and other methods.
// • The constructor should accept the car’s year model, make and speed as arguments. 
// • Accessor methods should get the values stored in an object’s year, Model, make, and speed fields. 
// • Accelerate method should add 5 to the speed field each time it is called.
// • Brake method should subtract 5 from the speed field each time it is called.
// Demonstrate the class in a program that creates a Car object, and then calls the accelerate method five times. After each call to the accelerate method, get the current speed of the car and display it. Call the brake method five times. After each call to the brake method, get the current speed of the car and display it.

public class Car {
    int model;
    String make;
    int speed = 0;

    Car(int a, String m, int s) {
        model = a;
        make = m;
        speed = s;
    }

    void accessor() {
        System.out.println("Details");
        System.out.println("Model : " + model);
        System.out.println("Make : " + make);
        System.out.println("Speed : " + speed);
    }

    void accelerate() {
        speed += 5;
    }

    void brake() {
        speed -= 5;
    }

    public static void main(String[] args) {
        Car c1 = new Car(2016, "Bugatti", 200);
        c1.accessor();
        System.out.println("\nAfter Accelerating");
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accelerate();
        c1.accessor();
        System.out.println("\nAfter Brake");
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.brake();
        c1.accessor();
    }

}
