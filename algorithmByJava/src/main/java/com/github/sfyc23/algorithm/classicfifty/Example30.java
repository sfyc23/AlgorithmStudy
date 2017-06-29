package com.github.sfyc23.algorithm.classicfifty;

import java.util.Random;

/**
 * Author :leilei on 2017/6/28 12:39
 * 【程序30】  题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
 * 1.程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
 */
public class Example30 {
    public static void main(String[] args) {

        int[] numbers = getRandomInt(10);
        System.out.print("当前数组：\t");
        printlnArray(numbers);


        bubbleSort(numbers);
        System.out.print("排序后的数组：\t");
        printlnArray(numbers);

        int insertInt = 25;
        System.out.println("插入数值：" + insertInt);

        int[] newNumbers = insertNum(numbers, insertInt);
        System.out.print("插入后的数组：\t");
        printlnArray(newNumbers);


        bubbleSort(newNumbers);
        System.out.print("插入后排序的数组：\t");
        printlnArray(newNumbers);


    }

    public static int[] insertNum(int[] array, int num) {

        int[] result = new int[array.length + 1];
        result[0] = num;
        for (int i = 0, length = array.length; i < length; i++) {
            result[i + 1] = array[i];
        }
        return result;
    }

    public static void bubbleSort(int[] numbers) {
        int temp = 0;
        int size = numbers.length;
        for (int i = 0, il = size - 1; i < il; i++) {
            for (int j = 0, jl = size - 1 - i; j < jl; j++) {
                //交换两数位置
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
    }

    public static int[] getRandomInt(int count) {
        int[] numbers = new int[count];
        Random rd = new Random();
        for (int i = 0, length = numbers.length; i < length; i++) {
            numbers[i] = rd.nextInt(100);
        }
        return numbers;
    }

    public static void printlnArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + "\t");
        }
        System.out.println();
    }
}
