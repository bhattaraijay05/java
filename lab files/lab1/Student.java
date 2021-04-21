// 1. Write a Java Class Student to meet the following specification:
//      The class should be able to support a 5 digit student ID, student name, marks for 3 subjects. You should have methods to set and get each of the attributes and calculate the average for the student. 

import java.util.Scanner;

class Student {
    int stuId, totalMark = 0;
    String stuName;
    int[] marks = new int[3];

    void setData() {
        System.out.println("Enter your details");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your student id");
        stuId = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter your name");
        stuName = scan.nextLine();
        System.out.println("Enter your marks in any three subject\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your marks in subject " + (i + 1));
            marks[i] = scan.nextInt();
        }
        scan.close();
    };

    void getData() {
        System.out.println("\nYour Details");
        System.out.println("Your student ID is : " + stuId);
        System.out.println("Your name is : " + stuName);
        System.out.println("Your marks are :\n");
        for (int i = 0; i < 3; i++) {
            System.out.println("Mark in Subject " + (i + 1) + " : " + marks[i]);
            totalMark += marks[i];
        }
        System.out.println("\nThe average of your marks is : " + (totalMark / 3));
    };

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setData();
        s1.getData();
    }
}
