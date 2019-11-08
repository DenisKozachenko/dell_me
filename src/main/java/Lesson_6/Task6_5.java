package Lesson_6;

public class Task6_5 {

        public static void main(String[] args) {
            try {
                iCanThrowException();
            } catch (NullPointerException e) {

                System.out.println(e);
            }
        }

            public static void iCanThrowException () throws NullPointerException {

                throw new NullPointerException();

            }

        }


