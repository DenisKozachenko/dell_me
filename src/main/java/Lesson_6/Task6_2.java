package Lesson_6;

import java.sql.SQLOutput;

public class Task6_2 {

        public static void main(String[] args) {

            try {
                System.out.println(divideByZero());
            } catch (RuntimeException e) {
                System.out.println("Following exception occurs: " + e);
            }

        }

        public static int divideByZero() {
            int a = 5;
            int b = 0;
            return a / b;
        }
}
