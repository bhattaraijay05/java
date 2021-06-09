import java.util.Scanner;

// Create a class temperature with member variable temp. Implement exception handling to test if 
// temperature is equal to zero.

class Temperature {
    int temp;

    Scanner scan = new Scanner(System.in);

    void getTemp() {
        System.out.println("Enter the temperature");
        temp = scan.nextInt();
        // scan.nextLine();
    }

    void checkTemperature() {
        try {
            getTemp();
            if (temp == 0) {
                throw new TemperatureException();
            } else {
                System.out.println("The temperature is " + temp);
            }
        } catch (TemperatureException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Temperature t = new Temperature();
        t.checkTemperature();
    }
}

class TemperatureException extends Exception {
    TemperatureException() {
    }

    public String toString() {
        return ("java.exception.TemperatureException: Temperature is zero");
    }
}