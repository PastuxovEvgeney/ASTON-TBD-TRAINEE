package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Task2 {
    public static void main(String[] args) {
        Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        try {
            System.out.print("Введите первую строку: ");
            String s = bufferedReader.readLine();
            System.out.print("Введите вторую строку: ");
            String s2 = bufferedReader.readLine();

            if (s.equals(s2)) {
                System.out.println("Строки идентичны");
            } else {
                System.out.println("Строки неидентичны");
            }
        } catch (IOException e) {
            System.out.println("Ошибка ввода данных");
        }

    }
}
