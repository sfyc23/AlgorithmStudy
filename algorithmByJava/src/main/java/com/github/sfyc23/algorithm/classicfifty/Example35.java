package com.github.sfyc23.algorithm.classicfifty;

import java.util.Arrays;

/**
 * Author :leilei on 2017/6/28 12:39
 * * Author :leilei on 2017/6/28 12:42
 * 【程序35】  题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Example35 {
    public static void main(String[] args) {
//        int[] numbers = getRandomArrayInt(10);
        int[] numbers = new int[]{1, 2, 5, 3, 4};
        System.out.println("原数组：" + Arrays.toString(numbers));

        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;

        int temp = 0;
        //得到数组的最大值，最小值所在位置
        for (int i = 0, length = numbers.length; i < length; i++) {
            temp = numbers[i];
            if (max < temp) {
                max = temp;
                maxIndex = i;
            }
            if (min > temp) {
                min = temp;
                minIndex = i;
            }
        }
        replace(numbers, maxIndex, 0);
        //如果最小值是第一位，则已经最大值替换成最大值所在的位置
        if (minIndex != 0) {
            replace(numbers, minIndex, numbers.length - 1);
        } else {
            replace(numbers, maxIndex, numbers.length - 1);
        }
        System.out.println("互换后:"+Arrays.toString(numbers));
    }
    /**
     * 互换数组的位置
     */
    public static void replace(int[] numbers, int p1, int p2) {
        int temp = numbers[p1];
        numbers[p1] = numbers[p2];
        numbers[p2] = temp;
    }
}
