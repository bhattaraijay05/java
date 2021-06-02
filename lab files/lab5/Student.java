public class Student {
    String name;
    int[] marks = new int[100];
    int totalMark = 0;
    int average = 0;

    void showResult() {
        try {
            for (int i : marks) {
                if (marks[i] < 0) {
                    throw new ArrayIndexOutOfBoundsException("Mark greater than 0 is expected");
                } else if (marks[i] > 50) {
                    throw new ArithmeticException("Mark cant be more than 50");
                }
            }

            for (int i = 0; i < 6; i++) {
                totalMark += marks[i];
            }
            average = totalMark / 6;
            System.out.println("Total mark is " + totalMark);
            System.out.println("Average mark is " + average);
        } catch (ArithmeticException e) {
            System.out.println("Mark is more than 50");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Mark is less than 0");
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = args[0];
        s1.marks[0] = Integer.parseInt(args[1]);
        s1.marks[1] = Integer.parseInt(args[2]);
        s1.marks[2] = Integer.parseInt(args[3]);
        s1.marks[3] = Integer.parseInt(args[4]);
        s1.marks[4] = Integer.parseInt(args[5]);
        s1.marks[5] = Integer.parseInt(args[6]);

        System.out.println("Hi " + s1.name);
        s1.showResult();
    }
}
