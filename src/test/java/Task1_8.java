import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1_8 {

    public void main(String[] args) {

        int[] fig = {72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};

        ;
        printList(transformIntToChar(fig));
    }


    private List<Character> transformIntToChar(int[] values) {
        List<Character> buffer = new ArrayList<Character>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private void printList(List<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }


    }
}



