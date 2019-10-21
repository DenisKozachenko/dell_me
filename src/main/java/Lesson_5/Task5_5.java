package Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Task5_5 {

    public static List<String> lst = new ArrayList<>();

    public static void main (String ... arg){

        lst.add("String1");
        lst.add("String2");
        lst.add("String3");
        lst.add("String4");
        lst.add("String5");

        for (int i =0; i<lst.size(); i++){
            System.out.println(lst.get(i));
        }


    }
}
