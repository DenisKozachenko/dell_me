package Lesson_6;

public class Task6_4 {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
