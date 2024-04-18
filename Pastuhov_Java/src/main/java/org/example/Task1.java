package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task1 {
    public static void main(String[] args) {
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        int a, b;
        try {
            System.out.print("Введите a: ");
            String s1 = bufferedReader.readLine();
            System.out.print("Введите b: ");
            String s2 = bufferedReader.readLine();
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
            int sum = a + b;
            int subtraction = a - b;
            int multiplication = a * b;
            int division = a / b;
            System.out.printf("a + b = %s%n", sum);
            System.out.printf("a - b = %s%n", subtraction);
            System.out.printf("a * b = %s%n", multiplication);
            System.out.printf("a / b = %s%n", division);
            System.out.print("Результат сравнения a и b: ");
            if (a < b) {
                System.out.println("a меньше b");
            } else if (a > b) {
                System.out.println("a больше b");
            } else {
                System.out.println("a равно b");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода данных");
        }

    }

}
