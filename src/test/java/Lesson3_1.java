public class Lesson3_1 {

    public static void main(String[] args){
       int i = 10;
       int j = 10;

        while (i<=20){
            System.out.println(i);
            i++;
        }
        System.out.println("<------------------------>");
        do {
            System.out.println(j);
            j++;
        } while (j<=20);

        System.out.println("<------------------------>");

        for (int k = 10; k <= 20; k++){

            System.out.println(k);
        }
        System.out.println("<------------------------>");
        for (int m =1; m <= 100; m++ ){

            if (m % 3 == 0){

                System.out.println(m);
            }
        }


    }
}
