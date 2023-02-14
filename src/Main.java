public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
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
        } else if (age >= 19 && age <= 24) {
            System.out.println("Если человеку " + age + " лет, то его место в университете.");
        } else if (age > 24) {
            System.out.println("Если человеку " + age + " лет, то ему пора ходить на работу");
        }
    }

    public static void task5() {
        System.out.println("Задание 5");
        int age = 50;
        if (age < 5) {
            System.out.println("Если возраст ребенка " + age + " лет, то ему нельзя кататься на атракционе.");
        } else if (age >= 5 && age <= 14) {
            System.out.println("Если возраст ребенка " + age + " лет, то ему можно кататься на атракционе в соправождение взрослого.");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка " + age + " лет, то ему можно кататься на атракционе без соправождение взрослого.");
        }
    }

    public static void task6() {
        System.out.println("Задание 6");
        int occupiedStanding = 45;
        int occupiedSeats = 60;
        byte totalSeatsInTheVan = 102;
        byte totalSeats = 60;
        int totalStanding = totalSeatsInTheVan - totalSeats;
        int placesSeatsLeft = totalSeats - occupiedSeats;
        int placesStandingLeft = totalStanding - occupiedStanding;
        int totalPlacesLeft = totalSeatsInTheVan - (occupiedSeats + occupiedStanding);
        int totalOccupiedSeats = occupiedSeats + occupiedStanding;
        if (totalOccupiedSeats < 102) {
            System.out.println("всего сидячих мест осталось " + placesSeatsLeft);
            System.out.println("всего стоячих мест осталось " + placesStandingLeft);
            System.out.println("всего свободных мест осталось " + totalPlacesLeft);
        } else {
            System.out.println("Свободных мест нет!");
        }
    }

    public static void task7() {
        System.out.println("Задание 7");
        int one = 100;
        int two = 50;
        int three = 30;
        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > one && two > three){
            System.out.println(two);
        } else if (three > one && three > two) {
            System.out.println(three);}
    }
}
