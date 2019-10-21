package Lesson_5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task5_8 {

    public static Map<String, String> stuff = new HashMap<>();
    public static Map<String, String> veg = new HashMap<>();

    public static void main(String... arg) {


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

        printList(catchVeg(stuff));
    }

    public static Map<String, String> catchVeg(Map<String, String> mapp) {

        String veget;
        veget = "vegetable";

        Set<Map.Entry<String, String>> set = mapp.entrySet();

        for (Map.Entry<String, String> me : set) {

            if (me.getValue() == veget) {

                veg.put(me.getKey(), me.getValue());
            }

        }

        return veg;
    }

    private static void printList(Map<String, String> vegetan) {

        Set<Map.Entry<String, String>> sett = vegetan.entrySet();

        for (Map.Entry<String, String> me : sett) {
            System.out.println(me.getKey() + " - " + " " + me.getValue());
        }

    }

}
