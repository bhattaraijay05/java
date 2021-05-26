class Student {
    String name = "Jay";
    int rollno = 12;
}

class Exam extends Student {
    int marks[] = new int[10];
    int totalMark = 0;

    void getResult() {
        marks[0] = 80;
        marks[1] = 70;
        marks[2] = 70;
        marks[3] = 80;
        marks[4] = 67;
        marks[5] = 94;
        marks[6] = 70;

        for (int i = 0; i < 7; i++) {
            totalMark += marks[i];
        }
        System.out.println("Name : " + name);
        System.out.println("Rollno : " + rollno);
        System.out.println("Total Mark " + totalMark);
    }
}

class Result extends Exam {
    void myResult() {
        System.out.println("....Result.....");
        super.getResult();
    }
}

/**
 * Mark
 */
public class Mark {

    public static void main(String[] args) {
        Result r1 = new Result();
        r1.myResult();
    }
}