package Lesson_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task6_6 {

    public static void main(String[] args) {
      try {
          readData();
      } catch (InputMismatchException e) {

      }
    }

    public static void readData() throws InputMismatchException {

        ArrayList<Integer> myList = new ArrayList<>();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter some number : ");
            int a;
            a = in.nextInt();
            myList.add(a);
            if (!in.hasNextInt()) {
                for (Integer b : myList) {
                    System.out.println(b);
                }
                throw new InputMismatchException();

            }


        }

    }
}
