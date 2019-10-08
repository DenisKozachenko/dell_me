package lesson_4;

public class Lesson4_2 {

    public int age;
    public int weight;
    public int strength;


    public Lesson4_2(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }



    public static boolean fight(Lesson4_2 anotherBoxer) {

    Lesson4_2 ourBoxer = new Lesson4_2(40, 100, 150);

    if (anotherBoxer.age > ourBoxer.age && anotherBoxer.weight>ourBoxer.weight && anotherBoxer.strength < ourBoxer.strength){
        return true;}
    else return  false;
    }



    public static void main(String[] args) {

        Lesson4_2 boxer1 = new Lesson4_2(22, 80, 100);
        System.out.println(fight(boxer1));

    }


}
