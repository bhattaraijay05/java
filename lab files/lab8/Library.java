import java.io.FileInputStream;
import java.io.FileOutputStream;

class Library {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("library.txt", false);
            String title = String.valueOf(args[0]);
            String author = String.valueOf(args[1]);
            String price = String.valueOf(args[2]);
            String edition = String.valueOf(args[3]);

            fout.write(title.getBytes());
            fout.write(' ');
            fout.write(author.getBytes());
            fout.write(' ');
            fout.write(price.getBytes());
            fout.write(' ');
            fout.write(edition.getBytes());
            fout.write('\n');
            fout.close();
            System.out.println("successfully written to file.");
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            FileInputStream fin = new FileInputStream("library.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
