public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
    }

    public static void task2() {
        System.out.println("Задание2");
        int temperature = -3;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов ,можно идти без шапки.");
        } else {
            System.out.println("На улице " + temperature + " градусов ,нужно надеть шапку!");
        }
    }

    public static void task3() {
        System.out.println("Задание3");
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " , придется заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + " , можно ехать спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");
        int age = 21;
        if (age >= 2 && age <= 6) {
            System.out.println("Если человеку " + age + " лет, тот ему нужно ходить в детский сад.");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если человеку " + age + " лет, тот ему нужно ходить в школу.");
        } else if (age >= 19 && age <=24 ) {
            System.out.println("Если человеку " + age + " лет, то его место в университете.");}
        else if (age >24) {
            System.out.println("Если человеку " + age + " лет, то ему пора ходить на работу");
        }
    }
}