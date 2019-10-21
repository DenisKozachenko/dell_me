package Lesson_5;

import java.util.ArrayList;
import java.util.List;

public class Task5_6 {

    public static List<String> lst = new ArrayList<>();
    public static List<String> largestStringArray = new ArrayList<>();

    public static void main(String... arg) {
        lst.add("String1");
        lst.add("String22");
        lst.add("String333");
        lst.add("String4444");
        lst.add("String55555");
        lst.add("String55555");
        lst.add("String55555");
        lst.add("String666666");
        lst.add("String6666661");
        lst.add("String6666661");

        String largestString = findLargestString(lst);
        largestStringArray = findDuplicates(lst, largestString);
        printList(largestStringArray);
    }

    private static String findLargestString(List<String> list) {
        int index = 0;
        int larg = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).length() > larg) {
                larg = lst.get(i).length();
                index = i;
            }
        }
        return list.get(index);
    }

    private static List<String> findDuplicates(List<String> list, String value) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            if (lst.get(i).length() == value.length()) {
                result.add(lst.get(i));
            }
        }
        return result;
    }

    private static void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
