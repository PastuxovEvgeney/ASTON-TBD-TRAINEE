package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
            int result1 = a + b;
            int result2 = a - b;
            int result3 = a * b;
            int result4 = a / b;
            System.out.printf("a + b = %s%n", result1);
            System.out.printf("a - b = %s%n", result2);
            System.out.printf("a * b = %s%n", result3);
            System.out.printf("a / b = %s%n", result4);
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