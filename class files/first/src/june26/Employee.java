import java.io.FileInputStream;
import java.io.FileOutputStream;

class Employee {
    public static void main(String[] args) {
        System.out.println("-------Writing Data in File-------");
        try {
            FileOutputStream fout = new FileOutputStream("ab.txt");
            String str = "Name : Jay,\nDepartment : Information Science Engineering,\nId : 001\n";
            byte b[] = str.getBytes();
            fout.write(b);
            fout.close();

            System.out.println("successful write.");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("-------Retrive Data From File-------");
        try {
            FileInputStream fin = new FileInputStream("ab.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}