import java.util.ArrayList;

public class Lesson3_3 {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>() ;
        for (int m =100; m>=0; m--){
            list.add(m);
        }
        System.out.println(list + "\n");

        System.out.println("<------------------------>");
        int i;
        int[] lst = {1, 2,3,4,5,6,7,8,9,10};
        int sum =0;

        for ( i=0; i <= lst.length-1; i ++){

            if (i != 0 || i != lst.length-1){

                continue;
            } else {

                sum += lst[i];
            }
        }
        System.out.println(sum);
    }


}
