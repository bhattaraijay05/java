import java.io.FileReader;
import java.io.IOException;

class TextFileRead {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("print.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}