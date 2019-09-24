import java.util.ArrayList;

public class Task1_8 {

    public void main(String[] args) {

        int[] fig = {72, 101, 108, 108, 111, 32, 119, 111, 114, 108, 100};

        ;
        printList(transformIntToChar(fig));
    }


    private ArrayList<Character> transformIntToChar(int[] values) {
        ArrayList<Character> buffer = new ArrayList<>();
        for (int i : values) {
            buffer.add(((char) i));
        }
        return buffer;
    }

    private void printList(ArrayList<Character> characters) {
        for (char c : characters) {
            System.out.print(c);
        }
    }
}



