package Lesson_6;

public class Task6_1 {

    public static void main(String... arg) {
        Task6_1 task = new Task6_1();
        task.printThis(76);
    }

    public static void printThis(int methodNumber) throws RuntimeException {

        if (methodNumber > 0) {
            System.out.println("This number is positive: " + methodNumber);
        } else if (methodNumber < 0) {
            System.out.println("This number is negative: " + methodNumber);
        } else throw new RuntimeException();
    }
}
