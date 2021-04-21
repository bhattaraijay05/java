// Write a Java Class Student to meet the following specification:
//      The class should be able to support a 5 digit student ID, student name, marks for 3 subjects. You should have methods to set and get each of the attributes and calculate the average for the student. 

class Student {
    int stuId = 15485, totalMark = 0;
    String stuName = "Jay Bhattarai";
    // int[] marks = new int[] { 88, 89, 78 };

    void setData(int m1, int m2, int m3) {
        System.out.println(m1 + " " + m2 + " " + m3);
        // System.out.println("Data will be set later");
    }

    void getData(int m1, int m2, int m3) {
        System.out.println("\nYour Details");
        System.out.println("Your student ID is : " + stuId);
        System.out.println("Your name is : " + stuName);
        System.out.println("Your marks are :\n");
        System.out.println(m1 + " " + m2 + " " + m3);
        System.out.println("\nThe average of your marks is : " + ((m1 + m2 + m3) / 3));

        // for (int i = 0; i < 3; i++) {
        // System.out.println("Mark in Subject " + (i + 1) + " : " + marks[i]);
        // totalMark += marks[i];
        // }
        // System.out.println("\nThe average of your marks is : " + (totalMark / 3));
    };

    public static void main(String[] args) {
        Student s1 = new Student();
        int m1 = Integer.parseInt(args[0]);
        int m2 = Integer.parseInt(args[1]);
        int m3 = Integer.parseInt(args[2]);
        s1.setData(m1, m2, m3);
        s1.getData(m1, m2, m3);

    }
}
