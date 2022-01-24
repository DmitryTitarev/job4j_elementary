package ru.job4j.condition;

public class Liken {

    public static void main(String[] args) {
        int first = 10;
        int second = 9;

        boolean result = first > second; //true
        System.out.println(result);

        result = first < second;  //false
        System.out.println(result);

        result = first == second; //false
        System.out.println(result);
    }
}
