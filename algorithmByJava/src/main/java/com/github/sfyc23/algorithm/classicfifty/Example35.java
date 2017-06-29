package com.github.sfyc23.algorithm.classicfifty;

/**
 * Author :leilei on 2017/6/28 12:39
 * * Author :leilei on 2017/6/28 12:42
 * 【程序35】  题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
 */
public class Example35 {
    public static void main(String[] args) {
        System.out.println();

        int[] numbers = Example31.getRandomArrayInt(10);
//        int[] numbers = new int[]{1, 2, 5, 3, 4};
        Example31.printArray("正序：\t", numbers);

        int max = numbers[0];
        int min = numbers[0];

        int maxIndex = 0;
        int minIndex = 0;

        int temp = 0;
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

        //如果是第一位，则被最大值替换
        if (minIndex != 0) {
            replace(numbers, minIndex, numbers.length - 1);
        } else {
            replace(numbers, maxIndex, numbers.length - 1);
        }
        Example31.printArray("排序：\t", numbers);

    }

    public static void replace(int[] numbers,int p1,int p2){
        int temp = numbers[p1];
        numbers[p1] = numbers[p2];
        numbers[p2] = temp;
    }
}
