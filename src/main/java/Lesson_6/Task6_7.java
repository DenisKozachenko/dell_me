package Lesson_6;

import java.util.HashSet;
import java.util.Set;

public class Task6_7 {

    private final String first;
    private final String last;


    public Task6_7(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task6_7)) return false;
        Task6_7 task6_7 = (Task6_7) o;
        return first.equals(task6_7.first) &&
                last.equals(task6_7.last);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public static void main(String[] args) {
        Set<Task6_7> s = new HashSet<>();
        s.add(new Task6_7("Donald", "Duck"));
        System.out.println(s.contains(new Task6_7("Donald", "Duck")));
    }
}
