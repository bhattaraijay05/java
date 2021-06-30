import java.io.*;

class ImageRead {
    public static void main(String args[]) throws Exception {
        FileInputStream fin = new FileInputStream("image.jpeg");
        FileOutputStream fout = new FileOutputStream("copied.jpeg");
        int i = 0;
        while ((i = fin.read()) != -1) {
            fout.write((byte) i);
        }
        fin.close();
        fout.close();
    }
}