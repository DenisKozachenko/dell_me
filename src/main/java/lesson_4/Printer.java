package lesson_4;

import java.util.ArrayList;
import java.util.List;

public class Printer {

    private int levelToner;
    private int printedPages;
    private boolean isDuplex = true;


    public int getLevelToner() {
        return levelToner;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setLevelToner(int levelToner) {
        this.levelToner = levelToner;
    }

    public void setPrintedPages(int printedPages) {
        this.printedPages = printedPages;
    }

    public void setDuplex(boolean duplex) {
        isDuplex = duplex;
    }

    public void fillUpToner(int levelToner) {

        if (levelToner > 100) {
            System.out.println("Box for toner is filled up");
        }
    }

    public Printer(int printedPages, boolean isDuplex) {
        this.printedPages = printedPages;
        this.isDuplex = isDuplex;
    }

    public List<Integer> print (Printer printer) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= printer.printedPages; i++) {
            result.add(i);

        }
        return result;
    }

    public static class Lesson4_ {

        public static void main(String... arg) {

            Printer printIt = new Printer(7, true);

            System.out.println(printIt.print(printIt));

        }

    }
}




