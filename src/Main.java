public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");

        int yearsOld = 18;
        if (yearsOld >= 18) {
            System.out.println("Если возраст человека равен " + yearsOld +", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + yearsOld + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задание 2");

        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("Задание 3");

        int carSpeed = 75;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + ", то можно ездить спокойно");
        }

        System.out.println("Задание 4");

        int age = 24;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему еще никуда не нужно ходить");
        }
        else if (age >=2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        System.out.println("Задание 5");

        int childrenAge = 13;
        if (childrenAge < 5) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему нельзя кататься на аттракционе");
        }
        else if (childrenAge >=5 && childrenAge <= 14) {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        }
        else {
            System.out.println("Если возраст ребенка равен " + childrenAge + ", то ему можно кататься на аттракционе без сопровождении взрослого");
        }

        System.out.println("Задание 6");

        int fullWagonCapacity = 102;
        int totalWagonSeats = 60;
        int totalUsedSeats = 44;


        if (totalUsedSeats >= 0 && totalUsedSeats <= totalWagonSeats) {
            System.out.println("В вагоне еще есть сидячее место");
        }
        else if (totalUsedSeats > totalWagonSeats && totalUsedSeats < fullWagonCapacity) {
            System.out.println("В вагоне еще есть стоячее место");
        }
        else {
            System.out.println("Вагон полностью забит");
        }

        System.out.println("Задание 7");

        int one = 3;
        int two = 2;
        int three = 1;

        if (one > two && one > three) {
            System.out.println("Самое больше число " + one);
        }
        else if (two > one && two > three) {
            System.out.println("Самое больше число " + two);
        }
        else {
            System.out.println("Самое больше число " + three);
        }


//        Даны три числа:
//
//        int one;
//        int two;
//        int three;
//
//        С помощью условного оператора и конструкции else напишите программу, которая вычисляет, какое из трех чисел бо́льшее, и выводит результат в консоль.
    }
}