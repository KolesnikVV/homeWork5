public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1(){
        System.out.println("Задание 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний.");
        } else  {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void task2(){
        System.out.println("Задание2");
        int temperature = -3;
        if (temperature >= 5) {
            System.out.println("На улице " + temperature + " градусов ,можно идти без шапки.");
        } else  {
            System.out.println("На улице " + temperature + " градусов ,нужно надеть шапку!");
        }

    }
}