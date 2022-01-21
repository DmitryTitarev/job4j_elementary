package ru.job4j.condition;

public class TrgArea {

    public static double area(double a, double b, double c) {
        double d = (a + b + c) / 2;
        double e = d * (d - a) * (d - b) * (d - c);
        double f = Math.sqrt(e);
        return f;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
