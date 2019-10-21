package Lesson_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task5_7 {

    public static void main (String ...arg){

       Map <String,String> stuff = new HashMap<>();


        stuff.put("watermelon", "berry");
        stuff.put("banana", "fruit");
        stuff.put("cherry", "berry");
        stuff.put("pineapple", "fruit");
        stuff.put("melon", "vegetable");
        stuff.put("cranberry", "berry");
        stuff.put("apple", "fruit");
        stuff.put("iris", "flower");
        stuff.put("potato", "vegetable");
        stuff.put("carrot", "vegetable");

        printList(stuff);
    }

    private static void printList(Map<String,String> mapp) {

        Set<Map.Entry<String, String>> set = mapp.entrySet();

        for (Map.Entry<String, String> me : set) {
            System.out.println(me.getKey() + " - " + " " + me.getValue());
        }

    }

}
