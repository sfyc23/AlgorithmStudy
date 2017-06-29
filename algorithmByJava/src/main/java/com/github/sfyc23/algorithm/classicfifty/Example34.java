package com.github.sfyc23.algorithm.classicfifty;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Author :leilei on 2017/6/28 12:39
 * 题目：输入3个数a,b,c，按大小顺序输出。 1.程序分析：利用指针方法。
 */
public class Example34 {
    public static void main(String[] args) {
        System.out.println();

        Integer[] numbers = getRandomArrayInt(3);
//        printArray("正序：\t", numbers);

//        bubbleReverse(numbers);


        //自带函数排序
        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println(Arrays.toString(numbers));

    }

    public static Integer[] getRandomArrayInt(int count) {
        Integer[] numbers = new Integer[count];
        Random rd = new Random();
        for (int i = 0, length = numbers.length; i < length; i++) {
            numbers[i] = rd.nextInt(100);
        }
        return numbers;
    }


    public static void bubbleReverse(int[] numbers) {
        int temp = 0;
        int size = numbers.length;
        for (int i = 0, il = size - 1; i < il; i++) {
            for (int j = 0, jl = size - 1 - i; j < jl; j++) {
                //交换两数位置
                if (numbers[j] < numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }
}
