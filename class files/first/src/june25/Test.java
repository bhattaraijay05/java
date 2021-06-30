import java.io.*;

class Test {
    public static void main(String args[]) {
        try {
            FileOutputStream fout = new FileOutputStream("./folder/abc.txt");
            String s = "WE ARE READING I/O STREAMS";
            byte b[] = s.getBytes();// converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}