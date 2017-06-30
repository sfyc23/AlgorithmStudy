package com.github.sfyc23.algorithm.classicfifty;

import java.util.Arrays;
import java.util.Random;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序36】  题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class Example36 {
    public static void main(String[] args) {
//        int[] numbers = getRandomArrayInt(10);
        Integer[] numbers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int m = 3;
        System.out.println("原数组："+ Arrays.toString(numbers));

        Integer[] newNums = moveArray(numbers, m);
        System.out.println("移动 " + m + " 位到最前之后："+ Arrays.toString(newNums));
    }

    public static Integer[] moveArray(Integer[] numbers, int m) {
        if (m < 0 || m > numbers.length - 1) {// 判断移动的位置是否合法
            throw new IllegalArgumentException(" 移动位数不能大于数组个数，且不能为负数");
        }
        Integer arrayLength = numbers.length;
        Integer[] newNums = new Integer[arrayLength];
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
}
