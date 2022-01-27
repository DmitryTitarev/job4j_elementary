package ru.job4j.condition;

public class IfElseReturn {

    public static boolean greatThen(int first, int second) {
        return first > second;
    }

    public static void main(String[] args) {
        boolean result = IfElseReturn.greatThen(10, 2);
        System.out.println(result);
    }
}
