package com.github.sfyc23.algorithm.classicfifty;

import java.util.Random;

/**
 * Author :leilei on 2017/6/28 12:39
 * 题目：将一个数组逆序输出。
 * 1.程序分析：用第一个与最后一个交换。
 */
public class Example31 {
    public static void main(String[] args) {

        int[] numbers = getRandomArrayInt(10);

        printArray("当前：\t", numbers);
        reverseArray("逆序输出：\t", numbers);

    }

    public static int[] getRandomArrayInt(int count) {
        int[] numbers = new int[count];
        Random rd = new Random();
        for (int i = 0, length = numbers.length; i < length; i++) {
            numbers[i] = rd.nextInt(100);
        }
        return numbers;
    }

    public static void printArray(String prifix, int[] numbers) {
        System.out.print(prifix);
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }

    public static void reverseArray(String prifix, int[] numbers) {
        System.out.print(prifix);
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "\t");
        }
        System.out.println();

    }

}
