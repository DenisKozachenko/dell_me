package Lesson_5;

import static Lesson_5.Task5_10.Day.MONDAY;

public class Task5_10 {



    public static void main(String[] args) {


            printTodaysNumber(Day.MONDAY);
        }



    public static void printTodaysNumber (Day currentDay){

        switch (currentDay){

            case MONDAY:
                System.out.println("Todays number is 1");
            case TUESDAY:
                System.out.println("Todays number is 2");
            case WEDNESDAY:
                System.out.println("Todays number is 3");
            case THURSDAY:
                System.out.println("Todays number is 4");
            case FRIDAY:
                System.out.println("Todays number is 5");
            case SATURDAY:
                System.out.println("Todays number is 6");
            case SUNDAY:
                System.out.println("Todays number is 7");
                break;
        }


    }

    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }


}
