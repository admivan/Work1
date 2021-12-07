package ru.dolgov.work;

// Задание 1

/**
 * Объявдение класса
 */
public class Work1 {
    /**
     * Объявление метода main
     * @param args
     */
    public static void main(String[] args) {

        // Задание 2
        byte b = 8; // Объявление переменой и инцилизация byte
        short s = 16; // Объявление переменой и инцилизация short
        int i = 32; // Объявление переменой и инцилизация int
        long l = 64; // Объявление переменой и инцилизация long
        float f = 32.32f; // Объявление переменой и инцилизация float
        double d = 64.64; // Объявление переменой и инцилизация double
        char c = 'c'; // Объявление переменой и инцилизация char
        boolean bo = true; // Объявление логической переменой и инцилизация boolean
        String str = "Я буду изучать java";

        System.out.println("Задание 2:");
        System.out.println("\nВывод переменой byte: " + b + '\n' + "Вывод переменой short: " + s + '\n'
                + "Вывод переменой int: " + i + '\n' + "Вывод переменой long: " + l + '\n'
                + "Вывод переменой float: " + f + '\n' + "Вывод переменой double: " + d + '\n'
                + "Вывод переменой char: " + c + '\n' + "Вывод переменой boolean: " + bo
                + '\n' + "Вывод переменой string: " + str);

        //Задиние 3

        float z = 2.3f;// Объявление переменой и инцилизация float
        float x = 5.7f;// Объявление переменой и инцилизация float
        float v = 8.2f;// Объявление переменой и инцилизация float
        float n = 8.2f;// Объявление переменой и инцилизация float

        System.out.println("\nЗадание 3:\n");

        System.out.println(calculating(z, x, v, n)); //Вывод возвращаемого значения и вызов метода calculating в консоль

        //Задиние 4

        System.out.println("\nЗадине 4:\n");

        System.out.println(sumWithin(10, 20)); // Вывод возвращаемого значение true или false в консоль и вызов метода sumWithin

        //Задиние 5

        System.out.println("\nЗадание 5:\n");

        positivOrNigative(-45);// Вызываем метод и передаем число

        //Задиние 6

        System.out.println("\nЗадание 6: \n");

        System.out.println(isNigative(5));// Вызываем метод и передаем число

        //Задание 7
        System.out.println("\nЗадание 7:\n");

        helloName("Иван\n"); //Вызываем и передаем строку в метод

    }

    //Задание 3

    /**
     * Объявление метода с принимающими даннами и возвращающим значением
     * @param z дробное число
     * @param x дробное число
     * @param v дробное число
     * @param n дробное число
     * @return Возвращение значение от вычисление формулы
     */
    public static float calculating(float z, float x, float v, float n) {

        return z * (x + (v / n)); //

    }

    //Задание 4

    /**
     * Объявление метода с возвращением логического значения
     * @param a целое число
     * @param b целое число
     * @return возвращение логического значения
     */
    public static boolean sumWithin(int a, int b) {

        return a >= 10 && b <= 20;

    }

    //Задание 5

    /**
     * Объявляем метод и принимаем число
     * @param a целое число
     */
    public static void positivOrNigative(int a) {
        if (a < 0) { //Сравнивем число если меньше нуля то число отрицательное

            System.out.println("Вы перадали число отрицательно");

        } else { //Если число больше нуля или ноль выводим сообщение число положительное

            System.out.println("Вы передали число положительное");

        }
    }

    //Задание 6

    /**
     * Объявляем метод и принимаем число
     * @param a целое число
     * @return возвращаем логическое значение правда ли число меньше 0
     */
    public static boolean isNigative(int a) {

        return a < 0;

    }

    //Задание 7

    /**
     * оздаем метод и принимаем строку
     * @param name  параметр String
     */
    public static void helloName(String name) {

        System.out.println("Привет, " + name); //Выводим строку в консоль Привет и принятую строку

    }
}

