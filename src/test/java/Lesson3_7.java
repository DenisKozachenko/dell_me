import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson3_7 {

    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(8,12));
    }

    public static int getGreatestCommonDivisor( int first, int second){

        int result = 0;

        if (first < 10 || second < 10){

            result = -1;

        }

        List<Integer> list = new ArrayList <Integer>();

        int min = minimum(first, second);

        for(int i = 1; i <= min / 2; i++) {
            if (first % i == 0 && second % i == 0) {
                list.add(i);
            }
        }

        if (first % min == 0 && second % min == 0) {
            list.add(min);
        }

        result = Collections.max(list);

        return result;

    }

    public static int minimum(int num1, int num2) {
        return num1 <= num2 ? num1 : num2;
    }



    }

