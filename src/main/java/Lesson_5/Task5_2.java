package Lesson_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task5_2 {

    public static  void main (String ...arg){

        System.out.println(Arrays.toString(DayOfWeek.values()));

    }
    public enum DayOfWeek {

        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }
}
