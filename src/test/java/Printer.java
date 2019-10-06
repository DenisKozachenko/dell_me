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

    public void fillUpToner(int levelToner){

        if (levelToner >100) {
            System.out.println("Box for toner is filled up");
        }
    }

    public Printer(int printedPages, boolean isDuplex) {
        this.printedPages = printedPages;
        this.isDuplex = isDuplex;
    }

    public Object printPages (Object obj){

        Object result = 0;
       for (int i = 0; i <= this.printedPages; i++ ) {
           result = i;

       }
       return result;
    }

    public class Lesson4_ {

        public void main() {

            Printer printIt = new Printer(23, true);

            System.out.println(printPages(printIt));

        }

    }
}




