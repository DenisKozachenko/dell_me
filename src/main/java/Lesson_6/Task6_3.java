package Lesson_6;

import javafx.scene.chart.ScatterChart;

import java.util.NoSuchElementException;

public class Task6_3 {


        public static void main (String[] args){
        int a = args.length;
        try {
            System.out.println(a);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }

        try {
            int b = 10 / a;
        } catch (ArithmeticException m){
            System.out.println(m);
        }
        int[] c = {1};
        try {
            System.out.println(c[1]);
        } catch (IndexOutOfBoundsException k) {
            System.out.println(k);
        }

    }
    }




