import java.util.ArrayList;
import java.util.List;

public class Lesson3_6 {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(-155));
    }

    public static int getEvenDigitSum(int number) {

        int result = 0;
        if (number < 0) {
            result = -1;
        } else {

            String n = Integer.toString(number);
            char[] charArray = n.toCharArray();
            List<Integer> cia = new ArrayList<Integer>();
            for (int i = 0; i <= charArray.length-1; i++) {
                int c = Character.getNumericValue(charArray[i]);
                if (c % 2 == 0) {
                    cia.add(c);
                }
            }
            for (int k = 0; k <= cia.size()-1; k++) {

                result += cia.get(k);

            }




        }

        return result;
    }
}
