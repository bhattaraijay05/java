class Student {
    private int rollno;
    protected int ranno;
    String grade;

    void displayData() {
        System.out.println("Roll No : " + rollno + "\nGrade : " + grade);
    }

}

class TestStudent extends Student {
    public static void main(String[] args) {
        Student s1 = new Student();
        // System.out.println(s1.rollno);
        System.out.println(s1.ranno);
    }
}