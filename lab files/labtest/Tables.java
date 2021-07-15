import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class Tables {
    public static void main(String[] args) {

        try {
            FileOutputStream fout = new FileOutputStream("tables.txt");

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = scan.nextInt();

            for (int i = 1; i <= 10; i++) {
                String makeString = number + " x " + i + " = " + (number * i);
                fout.write(makeString.getBytes());
                fout.write('\n');
            }

            fout.close();
            scan.close();
            System.out.println("successfully written multiple of " + number);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            System.out.println("Enter the multiple you want to read ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            String line = Files.readAllLines(Paths.get("tables.txt")).get(n - 1);
            System.out.println(line);
            scan.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}