package com.github.sfyc23.algorithm.classicfifty;

import java.util.Random;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序36】  题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class Example36 {
    public static void main(String[] args) {
        System.out.println();

        int[] numbers = getRandomArrayInt(10);
        printArray("正序：\t", numbers);

        int[] newNums = moveArray(numbers, 3);

        printArray("移动3位到最前之后"+"：\t", newNums);

    }

    public static int[] moveArray(int[] numbers, int m) {
        if (m < 0 || m > numbers.length - 1) {// 判断移动的位置是否合法
            throw new IllegalArgumentException(" 移动位数不能大于数组个数，且不能为负数");
        }

        int arrayLength = numbers.length;
        int[] newNums = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            if (i < m) {
                newNums[i] = numbers[arrayLength - m + i];
            } else {
                newNums[i] = numbers[i - m];
            }
        }
        return newNums;

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


}
