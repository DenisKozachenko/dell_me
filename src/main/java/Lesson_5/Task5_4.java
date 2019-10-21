package Lesson_5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task5_4 {

    public static int [] elements = new int[15];

    public static List <Integer> even = new ArrayList<>();

    public static void main (String ... arg){


        for (int i = 0; i <= elements.length -1; i ++ ){
            elements[i] = ((int) (Math.random() * 10));;

            System.out.println(elements[i]);
        }

        for (int i = 0; i <= elements.length -1; i ++ ){
            if (elements[i] % 2 == 0 ) {
             even.add(elements[i]);
            }

            }

        System.out.println("<--------------------->");

        for (int c : even ){
            System.out.println(c);
        }

    }


}
