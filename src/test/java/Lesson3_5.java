public class Lesson3_5 {

    public static void main(String[] args){

        System.out.println (min(2,4,7,1 ));
    }

    public static int min (int a, int b, int c, int d){

        return min(a, b) < min(c, d)? min(a, b):min(c, d);

    }

    public static int min (int a, int b){

     return (a<b)? a:b;
    }
}
