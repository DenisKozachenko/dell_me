package lesson_4;

public class Lesson4_5 {
    public static void main(String[] args) {
    }

    private class Cat {
        private String name;
        private int age;
        private int weight;

        private Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}