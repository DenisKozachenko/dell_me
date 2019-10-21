package Lesson_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task5_9 {



    public static void main (String ... arg){

         List <Integer> lst = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            lst.add((int) (Math.random() * 100));

            System.out.println(lst.get(i) + " ");
        }

        System.out.println(" Array`s size  " + lst.size());

        System.out.println("<------------------------->");

        HashSet<Integer> hashset = new HashSet<>(lst);
        System.out.println(hashset + " ");
        System.out.println(" HashSet`s size " + hashset.size());
        }


}
