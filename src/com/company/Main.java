package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Пользователь должен указать с клавиатуры положительное число, а
        программа должна создать массив указанного размера из случайных целых
        чисел из [0;15] и вывести его на экран в строку. После этого программа должна
        определить и сообщить пользователю о том, сумма какой половины массива
        больше: левой или правой, либо сообщить, что эти суммы модулей равны. Если
        пользователь введёт неподходящее число, то выдать соответствующее
        сообщение */
        int ch = 0;
        int polov;
        int sum1 = 0;
        int sum2 = 0;
        System.out.println("Введите любое целое число: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            do {
                ch = scan.nextInt();
                if (ch % 2 != 0 || ch < 0)
                    System.out.println("Введенное число не соответствует условиям. Введите, пожалуйста, другое число!");
            }
            while (ch % 2 != 0 || ch < 0);
        }
        int[] arr = new int[ch];
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            arr[i] = rnd.nextInt(16);
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        polov = arr.length / 2;
        for (int i = 0; i < polov; i++) {
            sum1 += arr[i];
        }
        for (int i = polov - 1; i < arr.length; i++) {
            sum2 += arr[i];
        }
        if (sum1 > sum2)
            System.out.println("Сумма 1-ой половины массива " + "(" + sum1 + ")" + " больше 2-ой " + "(" + sum2 + ")");
        else System.out.println("Сумма 2-ой половины массива " + "(" + sum2 + ")" + " больше 1-ой " + "(" + sum1 + ")");
    }
}